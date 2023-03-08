package ast.tipos;

import ast.ASTNodeImpl;

public class DoubleType extends ASTNodeImpl implements Type{
    public DoubleType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "DoubleType{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
