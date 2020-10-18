package com.org.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    //输出所有的学院，然后调用各个学院的系
    public void printCollege(){
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()){
            College college=  iterator.next();
            System.out.println(college.getName());
            printDepartment(college.createIterater());
        }
    }

    //输出学院输出系
    public  void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department)iterator.next();
            System.out.println(d.getName());
        }
    }
}
