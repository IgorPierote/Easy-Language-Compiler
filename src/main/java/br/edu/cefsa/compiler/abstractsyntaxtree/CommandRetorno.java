/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.compiler.abstractsyntaxtree;

/**
 *
 * @author guind
 */
public class CommandRetorno extends AbstractCommand {
    
    private String expression; // A expressão de retorno (ex: "1", "x + 2")

    public CommandRetorno(String expression) {
        this.expression = expression;
    }

    @Override
    public String generateJavaCode() {
        // Gera o código Java: "return expressão;"
        return "return " + expression + ";";
    }

    @Override
    public String toString() {
        return "CommandRetorno [expression=" + expression + "]";
    }
}
