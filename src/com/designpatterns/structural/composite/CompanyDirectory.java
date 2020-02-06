package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Han on 2020/2/6
 */
public class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public String getDetail() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CompanyDirectory:\n");
        for (Employee emp : employeeList) {
            stringBuilder.append("    " + emp.getDetail() + "\n");
        }

        return stringBuilder.toString();
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}
