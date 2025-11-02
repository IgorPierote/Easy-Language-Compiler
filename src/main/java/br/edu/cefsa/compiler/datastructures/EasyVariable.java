package br.edu.cefsa.compiler.datastructures;

public class EasyVariable extends EasySymbol {

    public static final int NUMBER = 0;
    public static final int TEXT = 1;
    public static final int BOOLEANO = 2;
    public static final int VOID = 3;
    public static final int FUNCAO = 4;

    int type;
    private String value;

    public EasyVariable(String name, int type, String value) {
        super(name);
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EasyVariable [name=" + name + ", type=" + type + ", value=" + value + "]";
    }

    @Override
    public String generateJavaCode() {
        String str;
        if (type == NUMBER) {
            str = "double ";
        } else if (type == TEXT) {
            str = "String ";
        } 
        else if (type == VOID) {
            str = "Void ";
        }  
        else {
            str = "Boolean ";
        }
        return str + " " + super.name + ";";
    }

}
