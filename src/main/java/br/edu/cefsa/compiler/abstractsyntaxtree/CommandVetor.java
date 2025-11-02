/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.compiler.abstractsyntaxtree;

/**
 *
 * @author guind
 */
public class CommandVetor extends AbstractCommand{
    
        
    private String _nome_atual;
    private String _tipo_atual;
    private int numero;
    
    public CommandVetor(String _nome_atual, String _tipo_atual, int numero) {
        this._nome_atual = _nome_atual;
        this._tipo_atual = _tipo_atual;
        this.numero = numero;
    }

    
    @Override
    public String generateJavaCode() {
        String str;
        
        // CORREÇÃO: Adicionado o ponto e vírgula no final
        str = _tipo_atual + " [] " + _nome_atual +  " = " + "new " + _tipo_atual + "[" + numero + "];";
        
        return str;
    }
    
     @Override
    public String toString() {
        return "CommandVetor " + _tipo_atual + " [" + numero + "]";
    }
}
