package com.designpatterns.structural.bridge;

/**
 * Created by xifeng.yang on 2020/2/5
 */
public class IconWindow extends Window {

    public IconWindow(IWindowSystem windowImpl) {
        super(windowImpl);
    }

    public void drawBorder() {
        windowImpl.drawLine();
        windowImpl.drawText();
    }
}
