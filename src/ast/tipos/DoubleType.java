package ast.tipos;

import ast.ASTNodeImpl;

public class DoubleType extends ASTNodeImpl implements Type{
    public DoubleType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("DoubleType\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");

        return string.toString();
    }
}
