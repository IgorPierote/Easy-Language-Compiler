package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.ArrayList;

// Esta classe se tornou obsoleta com a nova arquitetura do EasyProgram,
// mas a mantemos para evitar erros de compilação na gramática legada.
public class CommandBlocoMain extends AbstractCommand {

    private ArrayList<AbstractCommand> comandos;

    public CommandBlocoMain(ArrayList<AbstractCommand> comandos) {
        this.comandos = comandos;
    }

    @Override
    public String generateJavaCode() {
        // Não gera mais código diretamente, pois o EasyProgram agora cuida disso.
        return ""; 
    }

    @Override
    public String toString() {
        return "CommandBlocoMain [comandos=" + comandos + "]";
    }
}
