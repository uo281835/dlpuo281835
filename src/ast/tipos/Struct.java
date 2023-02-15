package ast.tipos;

import ast.ASTNodeImpl;

import java.util.List;

public class Struct extends ASTNodeImpl implements Type{
    public List<StructField> fields;

    public Struct(int line, int column, List<StructField> fields) {
        this(line, column);
        this.fields = fields;
    }

    public Struct(int line, int column) {
        super(line, column);
    }
}
