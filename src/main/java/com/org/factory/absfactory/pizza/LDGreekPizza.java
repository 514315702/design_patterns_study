package com.org.factory.absfactory.pizza;

public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的greekPizza");
        System.out.println("伦敦的greekPizza 准备原材料");
    }
}
