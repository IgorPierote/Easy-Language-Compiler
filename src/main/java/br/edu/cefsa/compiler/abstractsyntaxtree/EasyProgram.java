package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import br.edu.cefsa.compiler.datastructures.EasySymbolTable;

public class EasyProgram {

    private EasySymbolTable varTable;
    private ArrayList<CommandFuncao> funcoes;
    private ArrayList<AbstractCommand> comandos;

    public EasyProgram() {
        this.funcoes = new ArrayList<>();
        this.comandos = new ArrayList<>();
    }

    public void generateTarget() {
        StringBuilder str = new StringBuilder();
        str.append("import java.util.Scanner;\n");
        str.append("public class MainClass {\n");
        str.append("\tprivate static Scanner _scanner = new Scanner(System.in);\n\n");

        // 1. Gera variáveis globais como atributos estáticos
        if (varTable != null) {
            varTable.getAll().forEach(symbol -> {
                str.append("\tpublic static ").append(symbol.generateJavaCode()).append(";\n");
            });
        }
        str.append("\n");

        // 2. Gera Funções e Procedimentos como métodos estáticos
        funcoes.forEach(func -> {
            str.append("\t").append(func.generateJavaCode()).append("\n");
        });

        // 3. Gera o método main com os comandos do bloco principal
        str.append("\tpublic static void main(String args[]) {\n");
        comandos.forEach(cmd -> {
            str.append("\t\t").append(cmd.generateJavaCode()).append("\n");
        });
        str.append("\t}\n");
        str.append("}\n");

        try {
            FileWriter fr = new FileWriter(new File("MainClass.java"));
            fr.write(str.toString());
            fr.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public EasySymbolTable getVarTable() {
        return varTable;
    }

    public void setVarTable(EasySymbolTable varTable) {
        this.varTable = varTable;
    }

    public ArrayList<AbstractCommand> getComandos() {
        return comandos;
    }

    public void setComandos(ArrayList<AbstractCommand> comandos) {
        this.comandos = comandos;
    }

    public ArrayList<CommandFuncao> getFuncoes() {
        return funcoes;
    }

    public void addFuncao(CommandFuncao funcao) {
        this.funcoes.add(funcao);
    }
}
