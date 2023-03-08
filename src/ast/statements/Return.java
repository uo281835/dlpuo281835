package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

public class Return extends ASTNodeImpl implements Statement {
    private Expression expression;

    public Return(int line, int column, Expression expression) {
        this(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Return{" +
                "expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public Return(int line, int column) {
        super(line, column);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
