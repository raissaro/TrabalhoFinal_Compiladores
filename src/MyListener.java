import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MyListener extends MinhaGramaticaBaseListener {

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();
    private Stack<Map<String, String>> escopos = new Stack<>();


    @Override
    public void enterDeclaracao(MinhaGramaticaParser.DeclaracaoContext ctx) {
        System.out.println("In declaração: "+ctx.getText());
    }

    @Override
    public void exitDeclaracao(MinhaGramaticaParser.DeclaracaoContext ctx) {
        System.out.println("Out declaração: "+ctx.getText());
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id,tipo);
        }

        if(realizarChecagemTipo()){
            tabelaSimbolos.put(id,tipo);
        }else{
             System.out.println("Tipo " + tipo + " não reconhecido");
        }

        if (escopos.isEmpty()) {
            System.out.println("Erro: Variável " + id + " não declarada corretamente.");
        } else {
            Map<String, String> escopoAtual = escopos.peek();
            if (escopoAtual.containsKey(id)) {
                System.out.println("Erro: Variável " + id + " já declarada neste escopo.");
            } else {
                escopoAtual.put(id, tipo);
            }
        }

        Map<String, String> escopoAtual = escopos.peek();
        if (escopoAtual.containsKey(id)) {
            System.out.println("Erro: Variável " + id + " já declarada neste escopo.");
        } else {
            escopoAtual.put(id, tipo);
        }
    }

    public boolean realizarChecagemTipo() {
        for (Map.Entry<String, String> entry : tabelaSimbolos.entrySet()) {
            String tipoDeclarado = entry.getValue();
            if ("int".equals(tipoDeclarado)) {
                return true;
            } else if ("float".equals(tipoDeclarado)) {
                return true;
            } else if("void".equals(tipoDeclarado)){
                return true;
            } else if("bool".equals(tipoDeclarado)){
                return true;
            } else if("str".equals(tipoDeclarado)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }       

    @Override
    public void enterBloco(MinhaGramaticaParser.BlocoContext ctx) {
        // Inicia um novo escopo para o bloco
        escopos.push(new HashMap<>());
    }

    @Override
    public void exitBloco(MinhaGramaticaParser.BlocoContext ctx) {
        // Remove o escopo atual ao sair do bloco
        escopos.pop();
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }


}