package com.designpatterns.structural.bridge;

/**
 * Created by xifeng.yang on 2020/2/5
 */
public abstract class Window implements DrawAPI {

    protected IWindowSystem windowImpl;

    protected Window(IWindowSystem windowImpl) {
        this.windowImpl = windowImpl;
    }

    public void setWindowSystem(IWindowSystem windowImpl) {
        this.windowImpl = windowImpl;
    }

    @Override
    public void drawLine() {
        windowImpl.drawLine();
    }

    @Override
    public void drawText() {
        windowImpl.drawText();
    }

    @Override
    public void drawCircle() {
        windowImpl.drawCircle();
    }
}
