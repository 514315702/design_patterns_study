package com.org.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterater implements Iterator {

    //信息工程学院已list做
    List<Department> departmentList;
    int index = -1;

    public InfoCollegeIterater(List<Department>  departmentList) {
        this.departmentList = departmentList;
    }

    /**
     * 判断是否还有下一个
     * @return
     */
    public boolean hasNext() {
        if(index >= departmentList.size()-1){
            return false;
        }else{
            index +=1;
            return true;
        }


    }

    public Object next() {
        return departmentList.get(index);
    }

    //删除方法默认空实现
    public void remove() {

    }
}
