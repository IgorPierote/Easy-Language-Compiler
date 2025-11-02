package br.edu.cefsa.compiler.abstractsyntaxtree;

import br.edu.cefsa.compiler.datastructures.EasyVariable;

public class CommandDeclaracaoLocal extends AbstractCommand {

    private EasyVariable var;

    public CommandDeclaracaoLocal(EasyVariable var) {
        this.var = var;
    }

    @Override
    public String generateJavaCode() {
        String prefix = this.isGlobal ? "public static " : "";
        String typeStr = "";
        switch (var.getType()) {
            case EasyVariable.NUMBER:
                typeStr = "double";
                break;
            case EasyVariable.TEXT:
                typeStr = "String";
                break;
            case EasyVariable.BOOLEANO:
                typeStr = "boolean";
                break;
        }
        return prefix + typeStr + " " + var.getName() + ";"; // Adicionado ponto e vírgula para declarações completas
    }

    @Override
    public String toString() {
        return "CommandDeclaracaoLocal [name=" + var.getName() + ", type=" + var.getType() + "]";
    }
}