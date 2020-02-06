package com.designpatterns.structural.decorator;

/**
 * Created by xifeng.yang on 2020/2/6
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decorateShape) {
        super(decorateShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decorateShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
