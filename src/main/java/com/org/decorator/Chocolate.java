package com.org.decorator;

/**
 * 调味品
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDescribe("巧克力");
        setPrice(3.0f);
    }
}
