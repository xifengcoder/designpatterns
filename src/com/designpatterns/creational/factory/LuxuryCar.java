package com.designpatterns.creational.factory;

/**
 * Created by xifeng.yang on 2020/2/4
 */
public class LuxuryCar extends Car {

    public LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}
