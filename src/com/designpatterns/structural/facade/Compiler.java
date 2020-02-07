package com.designpatterns.structural.facade;

import sun.jvm.hotspot.interpreter.BytecodeStream;

import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by xifeng.yang on 2020/2/7
 */
public class Compiler {

    public Compiler() {
    }

    //Compiler提供了一个简单的接口, 用于为特定的机器编译源代码、并生成可执行代码.
    //在代码中固定要使用的CodeGenerator的种类.
    //Facade类是公共接口的一部分，但他并不是唯一的部分，子系统的其部分通常也是个公共的。
    //例如编译子系统中的Parser和Scanner类就是公共接口的一部分。
    public void compile(InputStream input, FileOutputStream output) {

        ProgramNodeBuilder builder = new ProgramNodeBuilder();
        Scanner scanner = new Scanner(input);
        Parser parser = new Parser();
        parser.parse(scanner, builder);

        RISCCodeGenerator generator = new RISCCodeGenerator(output);
        ProgramNode parseTree = new ProgramNodeBuilder().getRootNode();
        parseTree.traverse(generator);
    }
}
