package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Type;

public class Cast extends ASTNodeImpl implements Expression {
    private Type tipo2;
    private Expression expression;

    public Cast(int line, int column, Type tipo, Expression expression) {
        this(line, column);
        this.tipo2 = tipo2;
        this.expression = expression;
    }

    public Type getTipo2() {
        return tipo2;
    }

    public void setTipo2(Type tipo2) {
        this.tipo2 = tipo2;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "tipo2=" + tipo2 +
                ", expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public Cast(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return null;
    }
}
