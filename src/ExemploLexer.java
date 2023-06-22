import java.io.IOException;

//import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;

public class ExemploLexer {
    public static void main(String[] args) throws Exception {
        String filename = "C:/Users/raiss/OneDrive/Área de Trabalho/Quinto Semestre/Compiladores/Projeto_Pratico/codigo5.txt";
        try{            
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);     
            MinhaGramaticaParser parser = new MinhaGramaticaParser(tokens);    
            
            ParseTree ast = parser.inicio();
            System.out.println(ast.toStringTree());

            /*while(!lexer._hitEOF){
                Token token;
                token = lexer.nextToken();
                System.out.println("Token: "+ token.toString());
                System.out.println("    Lexema: " + token.getText());
                System.out.println("    Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
            }*/

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
