package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Type;

public abstract class ExpressionImpl extends ASTNodeImpl implements  Expression{
    public Type tipo;

    public ExpressionImpl(int line, int column, Type tipo) {
        super(line, column);
        this.tipo = tipo;
    }


    @Override
    public Type getType() {
        return tipo;
    }
}
