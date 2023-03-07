package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Type;

public class Cast extends ASTNodeImpl implements Expression {
    public Type tipo2;
    public Expression expression;

    public Cast(int line, int column, Type tipo, Expression expression) {
        this(line, column);
        this.tipo2 = tipo2;
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
