package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Type;

public class UnaryMinus extends ASTNodeImpl implements Expression {

    private Expression expression;

    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public UnaryMinus(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "UnaryMinus{" +
                "expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public Type getType() {
        return null;
    }
}
