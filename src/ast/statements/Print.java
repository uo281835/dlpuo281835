package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

public class Print extends ASTNodeImpl implements Statement {
    public Expression expression;

    public Print(int line, int column, Expression expression) {
        this(line, column);
        this.expression = expression;
    }

    public Print(int line, int column) {
        super(line, column);
    }
}
