package com.org.proxy.dynamicproxy;

import com.org.proxy.dynamicproxy.ITheacherDao;

public class TeacherDao implements ITheacherDao {

    public void teach() {
        System.out.println("老师授课中.....");
    }

    public void sayHallo(String name) {
        System.out.println("hallo "+name);
    }
}
