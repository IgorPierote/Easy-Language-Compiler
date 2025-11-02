/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.ArrayList;

/**
 *
 * @author wendell
 */
public class CommandChamada extends AbstractCommand {

    private String _nomeFuncao;
    private ArrayList<String> _argumentos; 

    public CommandChamada(String nomeFuncao, ArrayList<String> argumentos) {
        this._nomeFuncao = nomeFuncao;
        this._argumentos = argumentos;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();

        str.append(_nomeFuncao).append("(");

        for (int i = 0; i < _argumentos.size(); i++) {
            str.append(_argumentos.get(i)); 


            if (i < _argumentos.size() - 1) {
                str.append(", ");
            }
        }


        str.append(");");

        return str.toString();
    }

    @Override
    public String toString() {
        return "CommandChamada [funcao=" + _nomeFuncao + ", args=" + _argumentos + "]";
    }
}
