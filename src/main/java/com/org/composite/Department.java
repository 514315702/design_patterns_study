package com.org.composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent{

    //此处无集合

    public Department(String name, String descibe) {
        super(name, descibe);
    }
    //add 和remove 不需要写了


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescibe() {
        return super.getDescibe();
    }

    @Override
    public void print() {
        System.out.println(getName());
    }


}
