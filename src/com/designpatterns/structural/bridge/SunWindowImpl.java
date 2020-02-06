package com.designpatterns.structural.bridge;

/**
 * Created by xifeng.yang on 2020/2/5
 */
public class SunWindowImpl implements IWindowSystem {
    @Override
    public void drawLine() {
        System.out.println("SunWindowImpl drawLine");
    }

    @Override
    public void drawText() {
        System.out.println("SunWindowImpl drawText");
    }

    @Override
    public void drawCircle() {
        System.out.println("SunWindowImpl drawCircle");
    }
}
