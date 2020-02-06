package com.designpatterns.creational.factory;

/**
 * Created by xifeng.yang on 2020/2/4
 */
public class SmallCar extends Car {

    public SmallCar() {
        super(CarType.SMALL);
    }

    @Override
    protected void construct() {
        System.out.println("Building Small car");
    }
}
