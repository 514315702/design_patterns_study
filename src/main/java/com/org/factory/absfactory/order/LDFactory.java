package com.org.factory.absfactory.order;

import com.org.factory.absfactory.pizza.*;

public class LDFactory implements AbsFactory{

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("greek")){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
