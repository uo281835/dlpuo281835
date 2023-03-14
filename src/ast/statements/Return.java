package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

public class Return extends ASTNodeImpl implements Statement {
    private Expression expression;

    public Return(int line, int column, Expression expression) {
        this(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Return\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tExpresión:"+expression+ "'\n");
        return string.toString();
    }

    public Return(int line, int column) {
        super(line, column);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
