package com.org.factory.absfactory.order;


import com.org.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory){
        setFactory(absFactory);
    }

    private void setFactory(AbsFactory absFactory) {
        String orderType = ""       ; //用户输入
        this.absFactory = absFactory;
        Pizza pizza= null;
        do {
            orderType = getType();
            pizza = this.absFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购pizza失败");
                break;
            }
        }while (true);
    }

    private String getType()  {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizz type:");
            String str =  strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }

}
