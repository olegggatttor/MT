package com.itmo.obobrov;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

public class Main {
    public static void main( String[] args) throws Exception
    {
        GoodLangLexer lexer = new GoodLangLexer(CharStreams.fromStream(new FileInputStream("test")));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GoodLangParser parser = new GoodLangParser(tokens);
        GoodLangVisitWalker visitor = new GoodLangVisitWalker();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("main.c"))) {
            bw.write(visitor.visit(parser.program()));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}