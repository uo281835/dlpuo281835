package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.IntegerType;
import ast.tipos.Type;

public class Not  extends ASTNodeImpl implements Expression {
    public Expression expression;

    public Not(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Not(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return new IntegerType(line,column);
    }
}
