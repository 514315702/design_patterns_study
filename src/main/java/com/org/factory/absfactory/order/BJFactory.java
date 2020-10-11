package com.org.factory.absfactory.order;

import com.org.factory.absfactory.pizza.BJCheesePizza;
import com.org.factory.absfactory.pizza.BJGreekPizza;
import com.org.factory.absfactory.pizza.Pizza;

public class BJFactory implements AbsFactory{

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
