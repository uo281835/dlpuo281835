package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

import java.util.List;


public class If extends ASTNodeImpl implements Statement {
    public Expression condition;
    public List<Statement> body;

    public If(int line, int column, Expression condition, List<Statement> body, List<Statement> elses) {
        this(line, column);
        this.condition = condition;
        this.body = body;
        this.elses = elses;
    }

    public List<Statement> elses;

    public If(int line, int column) {
        super(line, column);
    }
}
