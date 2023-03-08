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
        return "LitReal{" +
                "value=" + value +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public Type getType() {
        return new DoubleType(line,column);
    }
}
