package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;
import ast.expressions.Variable;

public class Asign extends ASTNodeImpl {
    public Variable variable;
    public Expression value;

    public Asign(int line, int column, Variable variable) {
        super(line, column);
        this.variable = variable;
    }

    public Asign(int line, int column) {
        super(line, column);
    }
}
