package ast.tipos;

import ast.ASTNodeImpl;
import ast.definiciones.DefVariable;

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
        StringBuilder string = new StringBuilder();
        string.append("FunctionType\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tCampos\n");
        for(StructField def: fields){
            string.append("\t\t"+def+"\n");
        }

        return string.toString();
    }

    public Struct(int line, int column) {
        super(line, column);
    }
}
