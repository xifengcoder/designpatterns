package com.designpatterns.creational.factory;

/**
 * 工厂方法模式
 * Created by Han on 2020/2/4
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
