package ast.expressions;

import ast.ASTNode;
import ast.tipos.Type;

public interface Expression extends ASTNode {
    Type getType();
}
