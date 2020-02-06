package com.designpatterns.structural.composite;

/**
 * Created by xifeng.yang on 2020/2/6
 */
public class Developer implements Employee {

    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public String getDetail() {
        return "Developer{name: " + name + ", empId: " + empId + ", position: " + position + "}";
    }
}
