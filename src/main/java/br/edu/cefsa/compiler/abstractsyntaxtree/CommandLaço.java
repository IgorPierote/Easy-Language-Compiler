/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guind
 */
public class CommandLaço extends AbstractCommand {

    private String varControle;
    private String valorInicial;
    private String valorFinal;
    private String passo;
    private List<AbstractCommand> listaComandos;

    public CommandLaço(String varControle, String valorInicial, String valorFinal, String passo, List<AbstractCommand> listaComandos) {
        this.varControle = varControle;
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.passo = passo;
        this.listaComandos = listaComandos;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();

        // CORREÇÃO AQUI: Adicionar 'double ' para declarar a variável de controle
        String inicializacao = "double " + varControle + " = " + valorInicial;

        String condicao = varControle + " <= " + valorFinal;

        String incremento = varControle + " = " + varControle + " + " + passo;

        str.append("for (" + inicializacao + "; " + condicao + "; " + incremento + ") {\n");

        for (AbstractCommand cmd : listaComandos) {
            str.append("\t" + cmd.generateJavaCode() + "\n");
        }

        str.append("}\n");

        return str.toString();
    }

    @Override
    public String toString() {
        return "CommandLaço []";
    }

}
