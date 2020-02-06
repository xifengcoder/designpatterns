package com.designpatterns.creational.abstractfactory;

/**
 * Created by xifeng.yang on 2020/2/4
 */
public class Orange implements IFruit {
    @Override
    public String getFruitsName() {
        return "Orange";
    }

    @Override
    public String getFruitType() {
        return "Or";
    }
}
