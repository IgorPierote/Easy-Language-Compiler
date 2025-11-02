package br.edu.cefsa.compiler.abstractsyntaxtree;

import br.edu.cefsa.compiler.datastructures.EasySymbol;
import br.edu.cefsa.compiler.datastructures.EasyVariable;
import java.util.List;

public class CommandFuncao extends AbstractCommand {

    private String nome;
    private int tipoRetorno;
    private List<EasySymbol> parametros;
    private List<AbstractCommand> corpo;

    public CommandFuncao(String nome, int tipoRetorno, List<EasySymbol> parametros, List<AbstractCommand> corpo) {
        this.nome = nome;
        this.tipoRetorno = tipoRetorno;
        this.parametros = parametros;
        this.corpo = corpo;
    }

    @Override
    public String toString() {
        return "CommandFuncao [nome=" + nome + "]";
    }

    @Override
    public String generateJavaCode() {
        StringBuilder sb = new StringBuilder();
        String returnTypeStr = "";
        switch (tipoRetorno) {
            case EasyVariable.NUMBER: returnTypeStr = "double"; break;
            case EasyVariable.TEXT: returnTypeStr = "String"; break;
            case EasyVariable.BOOLEANO: returnTypeStr = "boolean"; break;
            case EasyVariable.VOID: returnTypeStr = "void"; break;
        }

        // --- LINHA DE DEPURACAO ADICIONADA ---
        System.out.println("DEBUG: CommandFuncao '" + nome + "'. isGlobal = " + this.isGlobal);
        // -------------------------------------

        String prefix = this.isGlobal ? "public static " : "";
        sb.append(prefix).append(returnTypeStr).append(" ").append(nome).append("(");

        for (int i = 0; i < parametros.size(); i++) {
            EasySymbol p = parametros.get(i);
            String paramTypeStr = "";
            switch (((EasyVariable)p).getType()) {
                case EasyVariable.NUMBER: paramTypeStr = "double"; break;
                case EasyVariable.TEXT: paramTypeStr = "String"; break;
                case EasyVariable.BOOLEANO: paramTypeStr = "boolean"; break;
            }
            sb.append(paramTypeStr).append(" ").append(p.getName());
            if (i < parametros.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(") {\n");

        for (AbstractCommand cmd : corpo) {
            sb.append("\t\t").append(cmd.generateJavaCode()).append("\n");
        }

        sb.append("\t}\n");
        return sb.toString();
    }
}
