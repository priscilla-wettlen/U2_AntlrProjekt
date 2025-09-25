package example;

import example.grammar.XpresLexer;
import example.grammar.XpresParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

public class RunExample {
    public static void main(String[] args) throws IOException {
        Compiler compiler = new Compiler();

        String sourceFile;
        String outFile;

        if (args.length > 0) {
            sourceFile = args[0];
        } else {
            System.out.println("Vilken fil vill du köra?");
            Scanner scanner = new Scanner(System.in);
            sourceFile = scanner.nextLine();
        }

        if (args.length > 1) {
            outFile = args[1];
        } else {
            System.out.println("Vad ska den kompilerade filen heta?");
            Scanner scanner = new Scanner(System.in);
            outFile = scanner.nextLine();
        }

        // Läs in källkoden
        CharStream inputStream = CharStreams.fromFileName(sourceFile);

        // Nedan används de filer som genererats med Xpres-grammatiken. Du ersätter dessa klasser med dina egna.

        // Här tar vi källkoden och tar ut en ström av tokens
        XpresLexer lexer = new XpresLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Här skapar vi en parser och parsar våra tokens
        XpresParser parser = new XpresParser(tokens);

        // Hämta ut noden som matchar den första regeln. I Xpres-fallet heter den "code"
        ParseTree tree = parser.code();

        // Skapa en tree walker och kasta in den till kompilatorn
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(compiler, tree);

        // Skriv det kompilerade programmet till en fil
        Writer writer = new OutputStreamWriter(new FileOutputStream(outFile), "US-ASCII");
        writer.write(compiler.getCompiledCode());
        writer.flush();
        writer.close();
    }
}
