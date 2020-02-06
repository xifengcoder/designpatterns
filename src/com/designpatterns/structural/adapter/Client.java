package com.designpatterns.structural.adapter;

/**
 * Created by xifeng.yang on 2020/2/5
 */

public class Client {
    public static void main(String[] args) {
        Movable bugattiVeyron = new SportsCar();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println(bugattiVeyronAdapter.getSpeedInKMPerHour());
        assert bugattiVeyronAdapter.getSpeedInKMPerHour() == 431.30312;
    }
}
