package ast.tipos;

import ast.ASTNodeImpl;

public class Char extends ASTNodeImpl implements Type{
    public Char(int line, int column) {
        super(line, column);
    }
}
