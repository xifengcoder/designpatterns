package com.designpatterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xifeng.yang on 2020/2/7
 */
public class StatementNode implements ProgramNode {
    List<ProgramNode> children = new ArrayList<>();

    @Override
    public void getSourcePosition(int line, int index) {
    }

    @Override
    public void add(ProgramNode node) {
        children.add(node);
    }

    @Override
    public void remove(ProgramNode node) {
        children.remove(node);
    }

    @Override
    public void traverse(CodeGenerator generator) {
        generator.visit(this);
        for (ProgramNode node : children) {
            node.traverse(generator);
        }
    }
}
