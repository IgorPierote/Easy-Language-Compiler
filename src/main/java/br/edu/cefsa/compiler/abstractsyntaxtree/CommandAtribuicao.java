package br.edu.cefsa.compiler.abstractsyntaxtree;

public class CommandAtribuicao extends AbstractCommand {

    private String id;
    private String expr;

    public CommandAtribuicao(String id, String expr) {
        this.id = id;
        if ("verdadeiro".equals(expr)) {
            this.expr = "true";
        }
        else if ("falso".equals(expr)){
            this.expr = "false";
        }
        else{
            this.expr = expr;
        }
    }

    @Override
    public String generateJavaCode() {
        return id + " = " + expr + ";";
    }

    @Override
    public String toString() {
        return "CommandAtribuicao [id=" + id + ", expr=" + expr + "]\n";
    }
    

}
