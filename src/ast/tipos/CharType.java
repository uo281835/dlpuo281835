package ast.tipos;

import ast.ASTNodeImpl;

public class CharType extends ASTNodeImpl implements Type{
    public CharType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "CharType{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
