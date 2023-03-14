package ast.tipos;

import ast.ASTNodeImpl;
import ast.definiciones.DefVariable;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends ASTNodeImpl implements Type{

    private List<DefVariable> params = new ArrayList<DefVariable>();
    private Type retorno;
    public FunctionType(int line, int column) {
        super(line, column);
    }

    public FunctionType(int line, int column, List<DefVariable> params, Type retorno) {
        super(line, column);
        this.params = params;
        this.retorno = retorno;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("FunctionType\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tTipo: '" + retorno+"\n");
        string.append("\tParámetros\n");
        for(DefVariable def: params){
            string.append("\t\t"+def+"\n");
        }

        return string.toString();
    }

    public List<DefVariable> getParams() {
        return params;
    }

    public void setParams(List<DefVariable> params) {
        this.params = params;
    }

    public Type getRetorno() {
        return retorno;
    }

    public void setRetorno(Type retorno) {
        this.retorno = retorno;
    }
}
