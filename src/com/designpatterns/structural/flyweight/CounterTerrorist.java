package com.designpatterns.structural.flyweight;

/**
 * Created by Han on 2020/2/7
 */
public class CounterTerrorist implements Player {
    private final String TASK;
    private String weapon;

    public CounterTerrorist(String taskType) {
        TASK = taskType;
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist " + this +
                " with weapon " + weapon + "|" +
                " Task is " + TASK);
    }
}
