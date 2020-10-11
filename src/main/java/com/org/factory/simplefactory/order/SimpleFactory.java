package com.org.factory.simplefactory.order;

import com.org.factory.simplefactory.pizza.CheesePizza;
import com.org.factory.simplefactory.pizza.GreekPizza;
import com.org.factory.simplefactory.pizza.Pizza;

//简单工厂模式
public class SimpleFactory {

    //根据orderType 返回对应的pizza对象
    public Pizza  createPizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek--");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("cheese--");
        }
        return pizza;
    }
}
