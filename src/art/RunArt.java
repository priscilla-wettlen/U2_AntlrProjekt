package art;

import art.grammar.ArtLexer;
import art.grammar.ArtParser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class RunArt {
    public static void main(String[] args) throws IOException {
        ArtCompiler artCompiler = new ArtCompiler();

        String sourceFile;
        String outFile;

        if(args.length > 0){
            sourceFile = args[0];
        } else {
            System.out.println("Enter file name:");
            Scanner scanner = new Scanner(System.in);
            sourceFile = "programs/hello.art";//scanner.nextLine();
        }

        if(args.length > 1){
            outFile = args[1];
        } else{
            System.out.println("Enter compiled file name:");
            Scanner scanner = new Scanner(System.in);
            //outFile = scanner.nextLine();
            outFile = "programs/hello.out";
        }

        CharStream inputStream = CharStreams.fromFileName(sourceFile); //version mismatch??

        ArtLexer lexer = new ArtLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ArtParser artParser = new ArtParser(tokens);

        ParseTree tree = artParser.code();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(artCompiler, tree);

        Writer writer = new OutputStreamWriter(new FileOutputStream(outFile));
        writer.write(artCompiler.getCompiledCode());
        writer.flush();
        writer.close();



    }
}
