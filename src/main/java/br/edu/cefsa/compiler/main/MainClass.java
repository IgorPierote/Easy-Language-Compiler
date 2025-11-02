package br.edu.cefsa.compiler.main;

import br.edu.cefsa.compiler.exceptions.EasySemanticException;
import br.edu.cefsa.compiler.parser.EasyLanguageLexer;
import br.edu.cefsa.compiler.parser.EasyLanguageParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        try {
            EasyLanguageLexer lexer;
            EasyLanguageParser parser;

            CharStream cs;
            if (args.length > 0) {
                // Assuming args[0] is just the filename, and it's in the resources directory
                cs = CharStreams.fromFileName("resources/" + args[0]);
            } else {
                cs = CharStreams.fromFileName("./resources/demonstracao_final.easy");
            }

            lexer = new EasyLanguageLexer(cs);

            // =================== TESTE DE DIAGNÓSTICO ===================
            // Pega todos os tokens e imprime no console.
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            tokenStream.fill(); // Carrega todos os tokens
            List<Token> tokens = tokenStream.getTokens();
            System.out.println("--- DIAGNOSTICO DE TOKENS ---");
            for (Token t : tokens) {
                System.out.println(t.toString());
            }
            System.out.println("---------------------------");
            // ==========================================================

            // Reseta o stream para o parser poder usar
            tokenStream.seek(0);

            parser = new EasyLanguageParser(tokenStream);

            parser.prog();

            System.out.println("Compilation Successful");

            // parser.exibeComandos();
            parser.generateCode();

        } catch (EasySemanticException ex) {
            System.err.println("Semantic error - " + ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("ERROR " + ex.getMessage());
        }
    }
}
