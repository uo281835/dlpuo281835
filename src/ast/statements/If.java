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
        StringBuilder string = new StringBuilder();
        string.append("If\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tCondición: '" + condition+"\n");
        string.append("\tCuerpo: '\n");
        for(Statement s: body){
            string.append("\t\t" + s+"\n");
        }
        if(elses.size()>0){
            string.append("\tCuerpo Else: '\n");
            for(Statement s: elses){
                string.append("\t\t" + s+"\n");
            }
        }

        return string.toString();
    }

    public If(int line, int column) {
        super(line, column);
    }
}
