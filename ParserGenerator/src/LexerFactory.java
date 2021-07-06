import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LexerFactory {
    ArrayList<TerminalRule> rules = new ArrayList<>();
    ArrayList<String> skip;

    LexerFactory(List<TerminalRule> rules, ArrayList<String> skip) {
        this.rules.addAll(rules);
        this.skip = skip;
    }

    String createTokensEnum(final String name) {
        return "enum class " + name + "Token"
                + " {\n\t" + rules
                .stream()
                .map(r -> r.name)
                .collect(Collectors.joining(", ")) + ", END"
                + "\n}";
    }

    String createLexerFile(final String name) {
        String mb;
        if (skip.isEmpty()) mb = "";
        else mb = ", ";
        return "import java.io.IOException\n" +
                "import java.io.InputStream\n" +
                "import java.text.ParseException\n" +
                "\n" +
                "class " + name + "LexicalAnalyzer(private val input: String) {\n" +
                "    var pos = 0\n" +
                "        private set\n" +
                "    var curLexed = \"\"\n" +
                "        private set\n" +
                "    var prevLexedString = \"\"\n" +
                "        private set\n" +
                "    val inputLen = input.length\n" +
                "    var save = \"\"\n" +
                "    lateinit var curToken: " + name + "Token\n" +
                "\n" +
                "    val regs: Array<Regex> = arrayOf(" + rules.stream().map(r -> "Regex(\"" + r.term + "\")").collect(Collectors.joining(", ")) + ")\n" +
                "\n" +
                "    val skip = arrayOf(Regex(\"\\$[a-z]\")" + mb + skip.stream().map(s -> "Regex(\"" + s + "\")").collect(Collectors.joining(", ")) + ")\n" +
                "\n" +
                "    init {\n" +
                "        nextLexem()\n" +
                "    }\n" +
                "\n" +
                "    private fun nextLexem() {\n" +
                "        if (pos >= inputLen) return\n" +
                "        if (curLexed == \"\") curLexed += input[pos++]\n" +
                "        if (curIsBlank()) return\n" +
                "        if (!anyRegexMatch()) throw ParseException(\"Unknown token\", pos)\n" +
                "        while (anyRegexMatch() && pos < inputLen) {\n" +
                "            curLexed += input[pos++]\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    fun anyRegexMatch(): Boolean {\n" +
                "        return regs.any { it.matches(curLexed) }\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    private fun curIsBlank(): Boolean {\n" +
                "        return skip.any { it.matches(curLexed)}\n" +
                "    }\n" +
                "\n" +
                "    fun nextToken() {\n" +
                "while (curIsBlank()) {\n" +
                "            curLexed = \"\"\n" +
                "            nextLexem()\n" +
                "        }\n" +
                "        if (curLexed == \"\") {\n" +
                "            curToken = " + name + "Token.END\n" +
                "            return\n" +
                "        }\n" +
                "        if (curLexed.length > 1) {\n" +
                "            save = curLexed.last().toString()\n" +
                "            curLexed = curLexed.dropLast(1)\n" +
                "        } else {\n" +
                "            save = \"\"\n" +
                "        }\n" +
                "        curToken = when {\n\t\t" +
                IntStream.range(0, rules.size())
                        .mapToObj(i -> "regs[" + i + "].matches(curLexed) -> " + name + "Token." + rules.get(i).name)
                        .collect(Collectors.joining("\n\t\t")) +
                "        \n\t\telse -> throw ParseException(\"Unknown token\", pos)\n\t\t}\n" +
                "prevLexedString = curLexed\n" +
                "        curLexed = \"\" + save\n" +
                "        if (curIsBlank()) {\n" +
                "            while (curIsBlank()) {\n" +
                "                curLexed = \"\"\n" +
                "                nextLexem()\n" +
                "            }\n" +
                "        } else nextLexem()" +
                "        }\n" +
                "    }\n";
    }
}
