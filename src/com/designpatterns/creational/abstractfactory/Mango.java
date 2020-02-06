package com.designpatterns.creational.abstractfactory;

/**
 * Created by xifeng.yang on 2020/2/4
 */
public class Mango implements IFruit {
    @Override
    public String getFruitsName() {
        return "Mango";
    }

    @Override
    public String getFruitType() {
        return "Mg";
    }
}
