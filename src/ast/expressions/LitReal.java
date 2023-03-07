package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.DoubleType;
import ast.tipos.Type;

public class LitReal  extends ASTNodeImpl implements Expression {
    public double value;

    public LitReal(int line, int column, double value) {
        this(line, column);
        this.value = value;
    }
    public LitReal(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return new DoubleType(line,column);
    }
}
