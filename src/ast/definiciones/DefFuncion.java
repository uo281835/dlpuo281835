package ast.definiciones;

import ast.ASTNodeImpl;
import ast.statements.Statement;
import ast.tipos.ErrorType;
import ast.tipos.FunctionType;
import ast.tipos.Type;

import java.util.ArrayList;
import java.util.List;

public class DefFuncion extends ASTNodeImpl implements  Definition {

    private FunctionType tipo;
    private String nombre;
    public List<DefVariable> defVariables = new ArrayList<DefVariable>();
    public List<Statement> statements = new ArrayList<Statement>();
    public DefFuncion(int line, int column, String nombre,FunctionType tipo, List<Statement> statements, List<DefVariable> variables){
        this(line,column);
        this.tipo = tipo;
        this.nombre = nombre;
        this.statements = statements;
        this.defVariables = variables;
        checkDefinitions();
    }

    private void checkDefinitions() {
        for(Definition def : defVariables){
            for(Definition def2 : defVariables){
                if(!def.equals(def2) && (def.getName().equals(def2.getName())))
                {
                    ErrorType error = new ErrorType(def2.getLine(),def2.getColumn(), "Error: Definición duplicada de la variable "+def2.getName());
                }
            }
        }
        for(Definition def : defVariables){
            for(Definition def2 : tipo.getParams()){
                if(!def.equals(def2) && (def.getName().equals(def2.getName())))
                {
                    ErrorType error = new ErrorType(def2.getLine(),def2.getColumn(), "Error: Definición del parámetro "+def2.getName()
                    +" y la variable "+def.getName()+" tienen el mismo nombre");
                }
            }
        }
        for(Definition def : defVariables){
            for(Definition def2 : defVariables){
                if(!def.equals(def2) && (def.getName().equals(def2.getName())))
                {
                    ErrorType error = new ErrorType(def2.getLine(),def2.getColumn(), "Error: Definición duplicada de la variable "+def2.getName());
                }
            }
        }

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
        StringBuilder string = new StringBuilder();
        string.append("Línea: '" + line+"\n");
        string.append("Columna: '" + column+"\n");
        string.append("Nombre: '" + nombre+"\n");
        string.append("Tipo: '" + tipo+"\n");
        string.append("Variables:");
        for(DefVariable def: defVariables){
            string.append("\t"+def+"\n");
        }
        string.append("Statements"+"\n");
        for(Statement def: statements){
            string.append("\t"+def+"\n");
        }
        return string.toString();
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
