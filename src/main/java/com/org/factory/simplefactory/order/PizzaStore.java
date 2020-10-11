package com.org.factory.simplefactory.order;

import com.org.factory.simplefactory.pizza.Pizza;

public abstract class PizzaStore {


    public static void main(String[] args) {
       //new OrderPizza();

        //pizza种类增加的时候，只需要修改factory
        new OrderPizza(new SimpleFactory());
        System.out.println("推出程序");
    }
}
