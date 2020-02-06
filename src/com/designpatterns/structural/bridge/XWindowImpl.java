package com.designpatterns.structural.bridge;

/**
 * Created by xifeng.yang on 2020/2/5
 */
public class XWindowImpl implements IWindowSystem {
    @Override
    public void drawLine() {
        System.out.println("XWindowImpl drawLine");
    }

    @Override
    public void drawText() {
        System.out.println("XWindowImpl drawText");
    }

    @Override
    public void drawCircle() {
        System.out.println("XWindowImpl drawCircle");
    }
}
