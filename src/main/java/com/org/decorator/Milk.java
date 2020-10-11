package com.org.decorator;

/**
 * 调味品
 */
public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        setDescribe("牛奶");
        setPrice(2.5f);
    }
}
