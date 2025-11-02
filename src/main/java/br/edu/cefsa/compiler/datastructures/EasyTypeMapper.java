/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.compiler.datastructures;

/**
 *
 * @author guind
 */
public class EasyTypeMapper {

    /**
     * Mapeia o código de tipo interno do EasyLanguage (int) para a String de
     * tipo Java.
     *
     * @param easyType O código de tipo (ex: EasyVariable.NUMBER).
     * @return A String de tipo correspondente em Java (ex: "double").
     */
    public static String mapTipo(int easyType) {
        // Assume-se que você definiu a constante VOID na classe EasyVariable
        // ou em uma nova classe EasyType, se necessário.
        final int VOID_TYPE = 3; // Supondo que VOID seja a próxima constante após BOOLEANO (2)

        if (easyType == EasyVariable.NUMBER) {
            return "double";
        } else if (easyType == EasyVariable.TEXT) {
            return "String";
        } else if (easyType == EasyVariable.BOOLEANO) {
            return "boolean"; // Use 'boolean' primitivo para eficiência, ou 'Boolean' wrapper
        } else if (easyType == VOID_TYPE) {
            return "void";
        }
        // Para tratamento de erros ou tipos desconhecidos
        return "Object";
    }

    /**
     * Mapeia o tipo de retorno interno (int) para o tipo de retorno Java em
     * declarações de métodos, retornando "void" para o tipo vazio.
     */
    public static String mapTipoRetorno(int easyType) {
        // Reutiliza a lógica principal, mas trata o VOID como 'void' (palavra-chave)
        return mapTipo(easyType);
    }
}
