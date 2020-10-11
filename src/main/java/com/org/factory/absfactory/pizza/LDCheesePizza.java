package com.org.factory.absfactory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的cheesePizza");
        System.out.println("伦敦的cheesePizza 准备原材料");
    }
}
