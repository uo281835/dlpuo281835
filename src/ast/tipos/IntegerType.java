package ast.tipos;

import ast.ASTNodeImpl;

public class IntegerType extends ASTNodeImpl implements Type{
    public IntegerType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("IntegerType\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");

        return string.toString();
    }
}
