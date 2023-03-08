package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Type;

public class Arithmetic extends ASTNodeImpl implements Expression {
    private Expression exp1;
    private Expression exp2;

    public Arithmetic(int line, int column) {
        super(line, column);
    }

    public Arithmetic(int line, int column, Expression exp1, Expression exp2, String operator) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Arithmetic{" +
                "exp1=" + exp1 +
                ", exp2=" + exp2 +
                ", operator='" + operator + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public String operator;

    public Expression getExp1() {
        return exp1;
    }

    public void setExp1(Expression exp1) {
        this.exp1 = exp1;
    }

    public Expression getExp2() {
        return exp2;
    }

    public void setExp2(Expression exp2) {
        this.exp2 = exp2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public Type getType() {
        return null;
    }
}
