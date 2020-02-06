package com.designpatterns.structural.bridge;

/**
 * Created by xifeng.yang on 2020/2/5
 */
public class Client {
    public static void main(String[] args) {
        IWindowSystem xWindowSystem = new XWindowImpl();
        Window iconWindow = new IconWindow(xWindowSystem);
        ((IconWindow) iconWindow).drawBorder();

        iconWindow.setWindowSystem(new SunWindowImpl());
        ((IconWindow) iconWindow).drawBorder();
    }
}
