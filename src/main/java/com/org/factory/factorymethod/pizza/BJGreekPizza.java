package com.org.factory.factorymethod.pizza;

public class BJGreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的greekPizza");
        System.out.println("北京的greekPizza 准备原材料");
    }
}
