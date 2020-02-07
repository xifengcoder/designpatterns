package com.designpatterns.structural.facade;

import com.sun.tools.javac.jvm.Code;
import sun.jvm.hotspot.interpreter.BytecodeStream;

import java.io.FileOutputStream;

/**
 * Created by Han on 2020/2/7
 */
public class RISCCodeGenerator extends CodeGenerator {
    protected RISCCodeGenerator(FileOutputStream stream) {
        super(stream);
    }
}
