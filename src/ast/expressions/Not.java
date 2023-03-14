package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.IntegerType;
import ast.tipos.Type;

public class Not  extends ASTNodeImpl implements Expression {
    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Not(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Not(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Not \n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tExpresión: '" + expression+"\n");
        return string.toString();
    }

    @Override
    public Type getType() {
        return new IntegerType(line,column);
    }
}
