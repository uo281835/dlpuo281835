package ast.expressions;

import ast.tipos.CharType;
import ast.tipos.Type;

public class LitCaracter extends ExpressionImpl{
    private char value;

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public LitCaracter(int line, int column, char value) {
        this(line, column, new CharType(line, column));
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("LitCaracter\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tValor: '" + value+"\n");
        return string.toString();
    }

    public LitCaracter(int line, int column, Type tipo) {
        super(line, column, tipo);
    }
}
