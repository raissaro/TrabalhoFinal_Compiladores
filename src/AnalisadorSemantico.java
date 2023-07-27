import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class AnalisadorSemantico {
    public static void main(String[] args) throws Exception {
        String filename = "C:/Users/raiss/OneDrive/Área de Trabalho/Quinto Semestre/Compiladores/Projeto_Pratico/codigo2.txt";
        try{            
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);     
            MinhaGramaticaParser parser = new MinhaGramaticaParser(tokens);  
            
            ParseTree ast = parser.inicio();
            System.out.println(ast.toStringTree());

            MyListener listener = new MyListener();
            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(listener,ast);

            listener.realizarChecagemTipo();

            //imprime a tabela de símbolos
            System.out.println(listener.getTabelaSimbolos().toString());


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
