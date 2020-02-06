package com.designpatterns.structural.bridge;

/**
 * Created by xifeng.yang on 2020/2/5
 */
public class ApplicationWindow extends Window {
    public ApplicationWindow(IWindowSystem windowSystem) {
        super(windowSystem);
    }

    public void drawCloseBox() {
        windowImpl.drawCircle();
        windowImpl.drawText();
    }
}
