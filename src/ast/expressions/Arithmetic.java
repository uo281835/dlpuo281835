package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Type;

public class Arithmetic extends ASTNodeImpl implements Expression {
    public Expression exp1;
    public Expression exp2;

    public Arithmetic(int line, int column) {
        super(line, column);
    }

    public Arithmetic(int line, int column, Expression exp1, Expression exp2, String operator) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.operator = operator;
    }

    public String operator;


    @Override
    public Type getType() {
        return null;
    }
}
