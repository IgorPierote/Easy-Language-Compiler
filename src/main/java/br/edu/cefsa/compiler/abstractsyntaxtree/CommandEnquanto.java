/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.List;

/**
 *
 * @author guind
 */
public class CommandEnquanto extends AbstractCommand {

    public CommandEnquanto(String condition, List<AbstractCommand> listaComandos) {
        this.condition = condition;
        this.listaComandos = listaComandos;
    }

    private String condition;
    private List<AbstractCommand> listaComandos;

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();
        str.append("while (" + condition + ") {\n");

        for (AbstractCommand cmd : listaComandos) {
            str.append("\t" + cmd.generateJavaCode() + "\n");
        }

        str.append("}\n");
        return str.toString();
    }

    @Override
    public String toString() {
        return "CommandEnquanto [condition=" + condition + ", listaComandos=" + listaComandos + "]";
    }
}
