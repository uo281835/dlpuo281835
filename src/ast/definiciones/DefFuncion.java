package ast.definiciones;

import ast.ASTNodeImpl;
import ast.statements.Statement;
import ast.tipos.Type;

import java.util.ArrayList;
import java.util.List;

public class DefFuncion extends ASTNodeImpl implements  Definition {

    private Type tipo;
    private String nombre;
    public List<DefVariable> defParams = new ArrayList<>();
    public List<DefVariable> defVariables = new ArrayList<DefVariable>();
    public List<Statement> statements = new ArrayList<Statement>();
    public DefFuncion(int line, int column, Type tipo, String nombre
            ,List<DefVariable> defParams, List<Statement> statements, List<DefVariable> variables){
        this(line,column);
        this.tipo = tipo;
        this.nombre = nombre;
        this.statements = statements;
        this.defVariables = variables;
        this.defParams=defParams;
    }
    public DefFuncion(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return tipo;
    }

    @Override
    public String toString() {
        return "DefFuncion{" +
                "tipo=" + tipo +
                ", nombre='" + nombre + '\'' +
                ", defParams=" + defParams +
                ", defVariables=" + defVariables +
                ", statements=" + statements +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public List<DefVariable> getDefParams() {
        return defParams;
    }

    public void setDefParams(List<DefVariable> defParams) {
        this.defParams = defParams;
    }

    public List<DefVariable> getDefVariables() {
        return defVariables;
    }

    public void setDefVariables(List<DefVariable> defVariables) {
        this.defVariables = defVariables;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String getName() {
        return nombre;
    }
}
