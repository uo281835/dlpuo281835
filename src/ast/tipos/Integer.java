package ast.tipos;

import ast.ASTNodeImpl;

public class Integer extends ASTNodeImpl implements Type{
    public Integer(int line, int column) {
        super(line, column);
    }
}
