package com.org.iterator;

import java.util.Iterator;

public class ComputerCollegeIterater  implements Iterator {

    Department[] departments;
    int position;

    public ComputerCollegeIterater(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个
     * @return
     */
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null){
            return false;
        }
        return true;
    }

    public Object next() {
        Department department = departments[position];
        position +=1;
        return department;
    }

    //删除方法默认空实现
    public void remove() {

    }
}
