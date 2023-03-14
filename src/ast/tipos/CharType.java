package ast.tipos;

import ast.ASTNodeImpl;

public class CharType extends ASTNodeImpl implements Type{
    public CharType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("CharType\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");

        return string.toString();
    }
}
