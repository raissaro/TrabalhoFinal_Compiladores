import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class ExemploLexer {
    public static void main(String[] args) throws Exception {
        String filename = "C:/Users/raiss/OneDrive/Área de Trabalho/Quinto Semestre/Compiladores/ProjetoPratico1/src/codigo.txt";
        try{            
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
            Token token;
            while(!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: "+ token.toString());
                System.out.println("    Lexema: " + token.getText());
                System.out.println("    Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
