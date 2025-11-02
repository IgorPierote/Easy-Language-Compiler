/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.compiler.datastructures;

public class EasyArray extends EasyVariable { 
    
    // Herda 'name', 'type', 'value' de EasyVariable
    private int size; 
    
    public EasyArray(String name, int type, String value, int size) {
        super(name, type, value); 
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    
        @Override
    public String generateJavaCode() {
        String str;
        
        String _tipo_atual;
        
        if (type == NUMBER) {
            _tipo_atual = "double ";
        } else if(type == TEXT) {
            _tipo_atual = "String ";
        }
        else{
            _tipo_atual = "Boolean ";
        }
        
        str = _tipo_atual + " [] " + name +  " = " + "new " + _tipo_atual + "[" + size + "];";
        
        return str;
    }
}
