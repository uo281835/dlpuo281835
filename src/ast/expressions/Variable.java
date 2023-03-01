package ast.expressions;

import ast.ASTNodeImpl;
import ast.expressions.Expression;
import ast.tipos.Type;

public class Variable extends ASTNodeImpl implements Expression {

    public String nombre;
    public Variable(int line, int column,String nombre) {
        super(line, column);
        this.nombre = nombre;
    }

    @Override
    public Type getType() {
        return null;
    }
}
