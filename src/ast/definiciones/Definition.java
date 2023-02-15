package ast.definiciones;

import ast.ASTNode;
import ast.tipos.Type;

public interface Definition extends ASTNode {
    Type getType();
    String getName();
}
