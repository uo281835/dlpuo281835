package ast.tipos;

import ast.ASTNodeImpl;

public class VoidType extends ASTNodeImpl implements Type{
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("VoidType\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");

        return string.toString();
    }

    public VoidType(int line, int column) {
        super(line, column);
    }
}
