package com.designpatterns.structural.facade;

/**
 * Created by xifeng.yang on 2020/2/7
 */
public interface ProgramNode {

    void getSourcePosition(int line, int index);

    void add(ProgramNode node);

    void remove(ProgramNode node);

    void traverse(CodeGenerator generator);
}
