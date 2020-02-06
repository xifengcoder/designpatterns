package com.designpatterns.structural.decorator;

/**
 * Created by xifeng.yang on 2020/2/6
 */
public class ShapeDecorator implements Shape {
    protected Shape decorateShape;

    public ShapeDecorator(Shape decorateShape) {
        this.decorateShape = decorateShape;
    }

    @Override
    public void draw() {
        decorateShape.draw();
    }
}
