package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.IntegerType;
import ast.tipos.Type;

public class LitInteger  extends ASTNodeImpl implements Expression {
    public int value;

    public LitInteger(int line, int column, int value) {
        this(line, column);
        this.value = value;
    }
    public LitInteger(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return new IntegerType(line, column);
    }
}
