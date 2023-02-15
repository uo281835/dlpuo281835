package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

import java.util.List;

public class While extends ASTNodeImpl implements Statement{
    public Expression condition;

    public While(int line, int column, Expression condition, List<Statement> body) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    public List<Statement> body;
    public While(int line, int column) {
        super(line, column);
    }
}
