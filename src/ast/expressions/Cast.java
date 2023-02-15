package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Type;

public class Cast extends ExpressionImpl{
    public Type tipo2;
    public Expression expression;

    public Cast(int line, int column, Type tipo, Type tipo2, Expression expression) {
        this(line, column, tipo);
        this.tipo2 = tipo2;
        this.expression = expression;
    }

    public Cast(int line, int column, Type tipo) {
        super(line, column, tipo);
    }
}
