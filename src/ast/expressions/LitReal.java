package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.DoubleType;
import ast.tipos.Type;

public class LitReal  extends ASTNodeImpl implements Expression {
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LitReal(int line, int column, double value) {
        this(line, column);
        this.value = value;
    }
    public LitReal(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("LitReal\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tValor: '" + value+"\n");
        return string.toString();
    }

    @Override
    public Type getType() {
        return new DoubleType(line,column);
    }
}
