import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file name:");
        String fileName = sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        CharStream input = CharStreams.fromStream(new FileInputStream(fileName));
        GrammarTransformer collector = new GrammarTransformer();
        GrammarLexer grammarLexer = new GrammarLexer(input);
        GrammarParser parser = new GrammarParser(new CommonTokenStream(grammarLexer));
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(collector, parser.gram());

        String packageName = name.toLowerCase(Locale.ROOT);

        Path tokenPath = Paths.get("src/" + packageName + "/" + name + "Token.kt").toAbsolutePath();
        Path lexPath = Paths.get("src/" + packageName + "/" + name + "LexicalAnalyzer.kt").toAbsolutePath();
        Path parserPath = Paths.get("src/" + packageName + "/" + name + "Parser.kt").toAbsolutePath();
        Path treePath = Paths.get("src/" + packageName+ "/Tree.kt").toAbsolutePath();

        if(!Files.exists(Paths.get("src/" + packageName ).toAbsolutePath())) {
            Files.createDirectory(Paths.get("src/" + packageName ).toAbsolutePath());
        }

        if(!Files.exists(tokenPath)) {
            Files.createFile(tokenPath);
        }
        if (!Files.exists(lexPath)) {
            Files.createFile(lexPath);
        }
        if (!Files.exists(parserPath)) {
            Files.createFile(parserPath);
        }
        if (!Files.exists(treePath)) {
            Files.createFile(treePath);
        }

        List<TerminalRule> list = new ArrayList<>();
        for (GrammarRule s : collector.grammar.rules) {
            if (s instanceof TerminalRule) {
                list.add((TerminalRule) s);
            }
        }

        String pckgPrefix = "package " + packageName + "\n\n";
        LexerFactory lex = new LexerFactory(list, collector.grammar.skipRegexs);

        try (BufferedWriter wr = new BufferedWriter(new FileWriter(tokenPath.toString()))) {
            wr.write(pckgPrefix + lex.createTokensEnum(name));
        }
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(lexPath.toString()))) {
            wr.write(pckgPrefix + lex.createLexerFile(name));
        }


        ParserFactory parserFactory = new ParserFactory(collector.grammar);
        parserFactory.createFirstSet();
        parserFactory.createFollowSet();

        try (BufferedWriter wr = new BufferedWriter(new FileWriter(treePath.toString()))) {
            wr.write(pckgPrefix + parserFactory.createTreeClass());
        }
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(parserPath.toString()))) {
            wr.write(pckgPrefix + parserFactory.createParser(name));
        }
    }
}