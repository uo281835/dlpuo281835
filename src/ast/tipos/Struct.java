package ast.tipos;

import ast.ASTNodeImpl;

import java.util.List;

public class Struct extends ASTNodeImpl implements Type{
    private List<StructField> fields;

    public List<StructField> getFields() {
        return fields;
    }

    public void setFields(List<StructField> fields) {
        this.fields = fields;
    }

    public Struct(int line, int column, List<StructField> fields) {
        this(line, column);
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "Struct{" +
                "fields=" + fields +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public Struct(int line, int column) {
        super(line, column);
    }
}
