package com.designpatterns.creational.factory;

/**
 * Created by Han on 2020/2/4
 */
public class SedanCar extends Car {

    public SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Sedan car");

    }
}
