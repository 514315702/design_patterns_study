package com.org.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{
    Department [] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java专业","java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("大数据专业","大数据专业");

    }

    public String getName() {
        return "计算机学院";
    }

    public void addDepartment(String name, String des) {
        Department department = new Department(name, des);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;

    }

    public Iterator createIterater() {
        return new ComputerCollegeIterater(departments);
    }
}
