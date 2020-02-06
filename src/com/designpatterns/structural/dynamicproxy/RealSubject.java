package com.designpatterns.structural.dynamicproxy;

//被代理对象（真实对象）
public class RealSubject implements ICallback {
    @Override
    public void operate1() {
        System.out.println("this is operate1");
    }

    @Override
    public void operate2(String str) {
        System.out.println("this is operate2 with args: " + str);
    }
}