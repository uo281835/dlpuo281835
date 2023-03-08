package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

import java.util.List;

public class While extends ASTNodeImpl implements Statement{
    private Expression condition;

    public While(int line, int column, Expression condition, List<Statement> body) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    private List<Statement> body;

    @Override
    public String toString() {
        return "While{" +
                "condition=" + condition +
                ", body=" + body +
                ", line=" + line +
                ", column=" + column +
                '}';
    }


    public While(int line, int column) {
        super(line, column);
    }

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
}
