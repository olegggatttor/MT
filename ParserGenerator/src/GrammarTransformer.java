import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GrammarTransformer extends GrammarBaseListener {
    Grammar grammar = new Grammar();

    @Override
    public void exitStart(GrammarParser.StartContext ctx) {
        super.exitStart(ctx);
        grammar.startRule = ctx.getChild(1).getText();
    }

    @Override
    public void exitSynth(GrammarParser.SynthContext ctx) {
        super.exitSynth(ctx);
        grammar.synthAttrs = ctx.fields().getText().split(",");
    }

    @Override
    public void exitSkip(GrammarParser.SkipContext ctx) {
        super.exitSkip(ctx);
        grammar.skipRegexs.add(ctx.getChild(0).getText().substring(1, ctx.getChild(0).getText().length() - 1));
    }

    @Override
    public void exitTerminal(GrammarParser.TerminalContext ctx) {
        super.exitTerminal(ctx);
        final TerminalRule rule = new TerminalRule(ctx.getChild(0).getText());
        if (ctx.getChild(1).getText().equals("[")) {
            rule.fields.addAll(Arrays.asList(ctx.getChild(2).getText().split(",")));
            rule.term = ctx.getChild(5).getText().substring(1, ctx.getChild(5).getText().length() - 1);
            if (!ctx.getChild(6).getText().equals(";")) {
                rule.code = ctx.getChild(6).getText();
            }
        } else {
            rule.term = ctx.getChild(2).getText().substring(1, ctx.getChild(2).getText().length() - 1);
            if (!ctx.getChild(3).getText().equals(";")) {
                rule.code = ctx.getChild(3).getText();
            }
        }
        grammar.rules.add(rule);
    }

    @Override
    public void exitNonTerminal(GrammarParser.NonTerminalContext ctx) {
        super.exitNonTerminal(ctx);

        NonTerminalRule rule = new NonTerminalRule(ctx.getChild(0).getText());
        ArrayList<String> fields = new ArrayList<>();

        for (var ch : ctx.children) {
            if (ch instanceof GrammarParser.FieldsContext) {
                for (var f : ((GrammarParser.FieldsContext) ch).children) {
                    if (f instanceof GrammarParser.FieldContext) {
                        fields.add(f.getText());
                    }
                }
            }
            if (ch instanceof GrammarParser.GrammarRuleContext) {
                if (ch.getChild(0) instanceof GrammarParser.CodeContext) {
                    rule.code = ch.getText();
                    continue;
                }
                rule.rightPart.add(new Pair(ch.getChild(0).getText(),
                        ((GrammarParser.GrammarRuleContext) ch).children.stream()
                                .filter(x -> x instanceof GrammarParser.ArgContext)
                                .map(ParseTree::getText)
                                .collect(Collectors.joining(", "))));
            }
            if (ch.getText().equals("|") || ch.getText().equals(";")) {
                rule.fields = fields;
                grammar.rules.add(rule);
                rule = new NonTerminalRule(ctx.getChild(0).getText());
            }
        }
    }
}

class Grammar {
    String startRule;
    ArrayList<GrammarRule> rules = new ArrayList<>();
    String[] synthAttrs;
    ArrayList<String> skipRegexs = new ArrayList<>();
}

class GrammarRule {
    String name;
    String code;
    ArrayList<String> fields = new ArrayList<>();
}

class Pair {
    String fst;
    String snd;

    Pair(String a, String b) {
        fst = a;
        snd = b;
    }
}

class TerminalRule extends GrammarRule {
    String term;

    TerminalRule(final String name) {
        this.name = name;
    }
}

class NonTerminalRule extends GrammarRule {
    ArrayList<Pair> rightPart = new ArrayList<>();

    NonTerminalRule(final String name) {
        this.name = name;
    }
}
