package com.designpatterns.creational.abstractfactory;

/**
 * Created by xifeng.yang on 2020/2/4
 */
public class Apple implements IFruit{
    @Override
    public String getFruitsName() {
        return "Apple";
    }

    @Override
    public String getFruitType() {
        return "Ap";
    }
}
