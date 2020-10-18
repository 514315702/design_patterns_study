package com.org.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    List<Department> departmentList;


    public InfoCollege() {

        departmentList  = new ArrayList<Department>();
        addDepartment("信息安全专业","信息安全专业");
        addDepartment("网络安全专业","网络安全专业");
        addDepartment("服务器安全专业","服务器安全专业");
    }

    public String getName() {
        return "信息工程学院";
    }

    public void addDepartment(String name, String des) {
        Department department = new Department(name, des);
        departmentList.add(department);

    }

    public Iterator createIterater() {
        return new InfoCollegeIterater(departmentList);
    }
}
