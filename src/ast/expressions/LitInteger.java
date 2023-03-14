package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.IntegerType;
import ast.tipos.Type;

public class LitInteger  extends ASTNodeImpl implements Expression {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LitInteger(int line, int column, int value) {
        this(line, column);
        this.value = value;
    }
    public LitInteger(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("LitInteger\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tValor: '" + value+"\n");
        return string.toString();
    }

    @Override
    public Type getType() {
        return new IntegerType(line, column);
    }
}
