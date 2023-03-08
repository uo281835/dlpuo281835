package ast.tipos;

import ast.ASTNodeImpl;

public class VoidType extends ASTNodeImpl implements Type{
    @Override
    public String toString() {
        return "VoidType{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }

    public VoidType(int line, int column) {
        super(line, column);
    }
}
