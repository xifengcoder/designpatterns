package com.designpatterns.structural.facade;

import sun.jvm.hotspot.interpreter.BytecodeStream;
import sun.jvm.hotspot.oops.Method;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Han on 2020/2/7
 */
public class Client {

    public static void main(String[] args) throws FileNotFoundException {
        Compiler compiler = new Compiler();
        compiler.compile(new FileInputStream("demo.java"),
                new FileOutputStream("demo.class"));
    }
}
