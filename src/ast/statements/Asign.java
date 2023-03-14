package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;
import ast.expressions.Variable;

public class Asign extends ASTNodeImpl implements Statement{
    private Expression variable;
    private Expression value;

    public Expression getVariable() {
        return variable;
    }

    public void setVariable(Expression variable) {
        this.variable = variable;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public Asign(int line, int column, Expression variable, Expression value) {
        super(line, column);
        this.variable = variable;
        this.value=value;
    }

    public Asign(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Asign\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tVariable: '" + variable+"\n");
        string.append("\tValor: '" + value+"\n");
        return string.toString();
    }
}
