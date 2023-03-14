package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Type;

public class Cast extends ASTNodeImpl implements Expression {
    private Type tipo2;
    private Expression expression;

    public Cast(int line, int column, Type tipo, Expression expression) {
        this(line, column);
        this.tipo2 = tipo;
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
        StringBuilder string = new StringBuilder();
        string.append("Cast \n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tTipo al que convertir: '" + tipo2+"\n");
        string.append("\tExpresión: '" + expression+"\n");
        return string.toString();
    }

    public Cast(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return null;
    }
}
