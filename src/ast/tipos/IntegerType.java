package ast.tipos;

import ast.ASTNodeImpl;

public class IntegerType extends ASTNodeImpl implements Type{
    public IntegerType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "IntegerType{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
