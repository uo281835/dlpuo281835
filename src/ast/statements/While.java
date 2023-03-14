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
        StringBuilder string = new StringBuilder();
        string.append("While\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tCondición: '" + condition+"\n");
        string.append("\tCuerpo: '\n");
        for(Statement s: body){
            string.append("\t\t" + s+"\n");
        }


        return string.toString();
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
