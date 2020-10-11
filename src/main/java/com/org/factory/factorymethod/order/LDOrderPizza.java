package com.org.factory.factorymethod.order;


import com.org.factory.factorymethod.pizza.*;


public class LDOrderPizza extends OrderPizza{


    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("greek")){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
