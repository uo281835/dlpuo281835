package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

import java.util.List;


public class If extends ASTNodeImpl implements Statement {
    private Expression condition;
    private List<Statement> body;

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }

    public List<Statement> getElses() {
        return elses;
    }

    public void setElses(List<Statement> elses) {
        this.elses = elses;
    }

    public If(int line, int column, Expression condition, List<Statement> body, List<Statement> elses) {
        this(line, column);
        this.condition = condition;
        this.body = body;
        this.elses = elses;
    }

    private List<Statement> elses;

    @Override
    public String toString() {
        return "If{" +
                "condition=" + condition +
                ", body=" + body +
                ", elses=" + elses +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public If(int line, int column) {
        super(line, column);
    }
}
