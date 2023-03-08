package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Type;

public abstract class ExpressionImpl extends ASTNodeImpl implements  Expression{
    protected Type tipo;

    public void setTipo(Type tipo) {
        this.tipo = tipo;
    }

    public ExpressionImpl(int line, int column, Type tipo) {
        super(line, column);
        this.tipo = tipo;
    }


    @Override
    public Type getType() {
        return tipo;
    }
}
