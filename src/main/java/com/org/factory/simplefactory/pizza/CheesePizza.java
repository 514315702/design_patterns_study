package com.org.factory.simplefactory.pizza;

public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给cheese披萨准备原材料");
    }
}
