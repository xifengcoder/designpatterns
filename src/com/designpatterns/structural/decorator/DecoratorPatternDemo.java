package com.designpatterns.structural.decorator;

/**
 * Created by xifeng.yang on 2020/2/6
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(rectangle);

        redCircle.draw();
        redRectangle.draw();
    }
}
