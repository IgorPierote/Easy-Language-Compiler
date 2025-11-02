package br.edu.cefsa.compiler.abstractsyntaxtree;

public abstract class AbstractCommand {

    protected boolean isGlobal = false;

    public abstract String generateJavaCode();

    public void setGlobal(boolean isGlobal) {
        this.isGlobal = isGlobal;
    }
}
