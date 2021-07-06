import java.util.*;
import java.util.stream.Collectors;

public class ParserFactory {
    private final Grammar grammar;
    private final HashMap<String, HashSet<String>> first = new HashMap<>();
    private final HashMap<String, HashSet<String>> follow = new HashMap<>();
    private final HashMap<String, HashSet<String>> firstAlpha = new HashMap<>();

    ParserFactory(Grammar gr) {
        grammar = gr;
    }

    public void createFirstSet() {
        for (GrammarRule rule : grammar.rules) {
            first.put(rule.name, new HashSet<>());
            if (rule instanceof NonTerminalRule) {
                firstAlpha.put(concat((NonTerminalRule) rule), new HashSet<>());
            } else if (rule instanceof TerminalRule) {
                firstAlpha.put(rule.name, new HashSet<>());
                first.get(rule.name).add(rule.name);
                firstAlpha.get(rule.name).add(rule.name);
            }
        }
        firstAlpha.put("EPS", new HashSet<>());
        firstAlpha.get("EPS").add("EPS");
        first.put("EPS", new HashSet<>());
        first.get("EPS").add("EPS");
        final ArrayList<NonTerminalRule> productions = grammar.rules
                .stream()
                .filter(x -> x instanceof NonTerminalRule)
                .map(x -> (NonTerminalRule) x)
                .collect(Collectors.toCollection(ArrayList::new));

        boolean changed = true;
        while (changed) {
            changed = false;
            // A -> alpha
            for (NonTerminalRule rule : productions) {
                final HashSet<String> old = new HashSet<>(first.get(rule.name));
                first.get(rule.name).addAll(first.get(rule.rightPart.get(0).fst));
                firstAlpha.get(concat(rule))
                        .addAll(first.get(rule.rightPart.get(0).fst));
                if (rule.rightPart.get(0).fst.equals("EPS")) {
                    for (int i = 1; i < rule.rightPart.size(); i++) {
                        first.get(rule.name).addAll(first.get(rule.rightPart.get(i).fst));
                        firstAlpha.get(concat(rule))
                                .addAll(first.get(rule.rightPart.get(i).fst));
                        if (!rule.rightPart.get(i).fst.equals("EPS")) break;
                    }
                }
                if (!first.get(rule.name).equals(old)) changed = true;
            }
        }
    }

    public void createFollowSet() {
        final ArrayList<NonTerminalRule> productions = grammar.rules
                .stream()
                .filter(x -> x instanceof NonTerminalRule)
                .map(x -> (NonTerminalRule) x)
                .collect(Collectors.toCollection(ArrayList::new));
        for (NonTerminalRule x : productions) {
            follow.put(x.name, new HashSet<>());
        }
        follow.get(grammar.startRule).add("END");
        boolean changed = true;
        while (changed) {
            changed = false;
            for (NonTerminalRule x : productions) {
                for (int i = 0; i < x.rightPart.size(); i++) {
                    Pair b = x.rightPart.get(i);
                    if (b.fst.matches("[A-Z]+")) continue;

                    final HashSet<String> old = new HashSet<>(follow.get(b.fst));
                    HashSet<String> y;
                    if (i + 1 == x.rightPart.size()) {
                        y = first.get("EPS");
                    } else {
                        y = first.get(x.rightPart.get(i + 1).fst);
                    }
                    boolean hasEps = y.remove("EPS");
                    follow.get(b.fst).addAll(y);
                    if (hasEps) {
                        y.add("EPS");
                        follow.get(b.fst).addAll(follow.get(x.name));
                    }

                    if (!follow.get(b.fst).equals(old)) changed = true;
                }
            }
        }
    }

    public String createTree(String gramName, String name) {
        ArrayList<GrammarRule> productions = grammar.rules.stream()
                .filter(x -> x.name.equals(name))
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<NonTerminalRule> nonterms = productions.stream()
                .filter(x -> x instanceof NonTerminalRule)
                .map(x -> (NonTerminalRule) x)
                .collect(Collectors.toCollection(ArrayList::new));

        String func = "fun " + name + "(" + String.join(", ", nonterms.get(0).fields) + ") : Tree {\n"
                + "val res = Tree(\"" + name + "\")\n"
                + "when (lexer.curToken) {\n";
        for (NonTerminalRule rule : nonterms) {
            HashMap<String, Integer> elToPos = new HashMap<>();
            Pair head = rule.rightPart.get(0);
            HashSet<String> tokens = new HashSet<>(first.get(head.fst));
            if (tokens.contains("EPS")) {
                tokens.remove("EPS");
                tokens.addAll(follow.get(name));
            }
            func += tokens.stream().map(t -> gramName + "Token." + t).collect(Collectors.joining(", "));
            func += " -> {\n" + rule.rightPart.stream()
                    .map(elem -> {
                        if (!(elem.fst.matches("[A-Z]+"))) {
                            if (!elToPos.containsKey(elem.fst)) {
                                elToPos.put(elem.fst, 0);
                            } else {
                                elToPos.replace(elem.fst, elToPos.get(elem.fst) + 1);
                            }
                            return "val " + elem.fst + elToPos.get(elem.fst) + " = "
                                    + elem.fst + "(" + elem.snd + ")\nres.children.add(" + elem.fst + elToPos.get(elem.fst) + ")";
                        } else {
                            String code = null;
                            if (!elem.fst.equals("EPS")) {
                                code = grammar.rules.stream().filter(x -> x.name.equals(elem.fst)).collect(Collectors.toList()).get(0).code;
                            }
                            if (code == null) code = "{ }";
                            return "res.children.add(Tree(\"" + elem.fst + "\"))\nres.children.last().run " + code + "\n\n" + (elem.fst.equals("EPS") ? "" : "verify(" + gramName + "Token." + elem.fst + ")\nlexer.nextToken()\n");
                        }
                    })
                    .collect(Collectors.joining("\n"));
            func += (rule.code == null ? "" : "\nres.run " + rule.code + "\n") + "\n}\n";
        }
        func += """
                else -> throw ParseException(
                                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
                            )
                }
                return res
                }""";
        return func;
    }

    public String createTreeClass() {
        return "class Tree(val node: String) {\n" +
                "    val children = arrayListOf<Tree>()\n" +
                Arrays.stream(grammar.synthAttrs)
                        .map(attr -> "\tvar " + attr + " = null")
                        .collect(Collectors.joining("\n")) +
                "\n\nfun getChild(i : Int) = children[i]\n\n" +
                "\n}";
    }

    public String createParser(String gramName) {
        ArrayList<String> nonterms = grammar.rules.stream()
                .filter(x -> x instanceof NonTerminalRule)
                .map(x -> x.name)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        return "import java.text.ParseException\n\nclass " + gramName + "Parser {\n" +
                "lateinit var lexer : " + gramName + "LexicalAnalyzer" +
                "\n\nfun parse(input: String): Tree {\n" +
                "        lexer = " + gramName + "LexicalAnalyzer(input)\n" +
                "        lexer.nextToken()\n" +
                "        return " + grammar.startRule + "()\n" +
                "    }\n\nfun getParsed() = lexer.prevLexedString\n\n" +
                "\nfun verify(token : " + gramName + "Token) {\n" +
                "\tif(token != lexer.curToken) throw ParseException(\n" +
                "                                \"Expected: ${token}, found: ${lexer.curToken}\", lexer.pos\n" +
                "                            )}\n\n" + nonterms.stream()
                .map(x -> createTree(gramName, x)).collect(Collectors.joining("\n\n")) +
                "\n}";

    }

    private String concat(NonTerminalRule rule) {

        return rule.rightPart.stream().map(x -> x.fst).collect(Collectors.joining(" "));
    }
}
