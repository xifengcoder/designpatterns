package com.designpatterns.structural.decorator;

/**
 * Created by xifeng.yang on 2020/2/6
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
