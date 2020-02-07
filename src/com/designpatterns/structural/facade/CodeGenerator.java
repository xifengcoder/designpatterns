package com.designpatterns.structural.facade;

import sun.jvm.hotspot.interpreter.BytecodeStream;
import sun.tools.tree.ReturnStatement;

import java.io.FileOutputStream;

/**
 * Created by xifeng.yang on 2020/2/7
 */
public abstract class CodeGenerator {

    protected FileOutputStream outputStream;

    protected CodeGenerator(FileOutputStream stream) {
        this.outputStream = stream;
    }

    public void visit(ProgramNode node) {
        if (node instanceof VariableProgramNode) {
            System.out.println("visit VariableProgramNode: " + node);
        } else if (node instanceof ExpressionNode) {
            System.out.println("visit ExpressionNode: " + node);
        } else if (node instanceof StatementNode) {
            System.out.println("visit StatementNode: " + node);
        }
    }
}
