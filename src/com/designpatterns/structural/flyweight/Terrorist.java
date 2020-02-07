package com.designpatterns.structural.flyweight;

/**
 * 恐怖分子
 * Created by xifeng.yang on 2020/2/7
 */
public class Terrorist implements Player {

    private final String TASK;
    private String weapon;

    public Terrorist(String taskType) {
        TASK = taskType;
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist " + this +
                " with weapon " + weapon + "|" +
                " Task is " + TASK);
    }
}
