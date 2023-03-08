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
        this.variable=value;
    }

    public Asign(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Asign{" +
                "variable=" + variable +
                ", value=" + value +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
