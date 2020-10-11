package com.org.factory.factorymethod.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的cheesePizza");
        System.out.println("北京的cheesePizza 准备原材料");
    }
}
