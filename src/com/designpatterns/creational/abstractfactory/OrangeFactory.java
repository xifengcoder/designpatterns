package com.designpatterns.creational.abstractfactory;

/**
 * Created by xifeng.yang on 2020/2/4
 */
public class OrangeFactory implements IFruitsFactory {
    @Override
    public IFruit getFruit() {
        return new Orange();
    }
}
