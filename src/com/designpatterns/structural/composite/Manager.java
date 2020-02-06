package com.designpatterns.structural.composite;

/**
 * Created by Han on 2020/2/6
 */
public class Manager implements Employee {
    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public String getDetail() {
        return "Manager{name: " + name + ", empId: " + empId + ", position: " + position + "}";
    }
}
