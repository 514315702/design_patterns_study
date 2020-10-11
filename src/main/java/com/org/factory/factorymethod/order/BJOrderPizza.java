package com.org.factory.factorymethod.order;


import com.org.factory.factorymethod.pizza.BJCheesePizza;
import com.org.factory.factorymethod.pizza.BJGreekPizza;
import com.org.factory.factorymethod.pizza.Pizza;


public class BJOrderPizza extends OrderPizza{


    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
