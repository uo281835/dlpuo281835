package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

public class Return extends ASTNodeImpl implements Statement {
    public Expression expression;

    public Return(int line, int column, Expression expression) {
        this(line, column);
        this.expression = expression;
    }

    public Return(int line, int column) {
        super(line, column);
    }
}
