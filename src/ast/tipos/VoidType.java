package ast.tipos;

import ast.ASTNodeImpl;

public class VoidType extends ASTNodeImpl implements Type{
    public VoidType(int line, int column) {
        super(line, column);
    }
}
