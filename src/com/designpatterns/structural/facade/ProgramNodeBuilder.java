package com.designpatterns.structural.facade;

/**
 * Created by xifeng.yang on 2020/2/7
 */
public class ProgramNodeBuilder {

    private ProgramNode rootNode;

    public ProgramNodeBuilder() {
        rootNode = new ExpressionNode();
    }

    public ProgramNode newVariable(String variableName) {
        rootNode.add(new VariableProgramNode(variableName));
        return rootNode;
    }

    public ProgramNode newAssignment(ProgramNode variable, ProgramNode expression) {
        rootNode.add(variable);
        rootNode.add(expression);
        return rootNode;
    }

    public ProgramNode newReturnStatement(ProgramNode value) {
        rootNode.add(value);
        return rootNode;
    }

    public ProgramNode getRootNode() {
        return rootNode;
    }
}
