package com.designpatterns.structural.facade;

/**
 * Created by Han on 2020/2/7
 */
public class VariableProgramNode implements ProgramNode {
    private String variableName;

    public VariableProgramNode(String name) {
        this.variableName = name;
    }

    @Override
    public void getSourcePosition(int line, int index) {

    }

    @Override
    public void add(ProgramNode node) {
        throw new UnsupportedOperationException("Unsupported add operation");
    }

    @Override
    public void remove(ProgramNode node) {
        throw new UnsupportedOperationException("Unsupported remove operation");
    }

    @Override
    public void traverse(CodeGenerator generator) {
        generator.visit(this);

    }
}
