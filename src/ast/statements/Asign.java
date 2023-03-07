package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;
import ast.expressions.Variable;

public class Asign extends ASTNodeImpl implements Statement{
    public Expression variable;
    public Expression value;

    public Asign(int line, int column, Expression variable, Expression value) {
        super(line, column);
        this.variable = variable;
        this.variable=value;
    }

    public Asign(int line, int column) {
        super(line, column);
    }
}
