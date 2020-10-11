package com.org.decorator;

/**
 * 调味品
 */
public class Soy extends Decorator{

    public Soy(Drink drink) {
        super(drink);
        setDescribe("豆浆");
        setPrice(2.0f);
    }
}
