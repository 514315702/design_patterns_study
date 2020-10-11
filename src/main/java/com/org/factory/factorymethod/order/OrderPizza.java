package com.org.factory.factorymethod.order;




import com.org.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {


    abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;//订购类型
        do {
            orderType = getType();
            pizza = createPizza(orderType);//抽象方法由工厂子类实现
            //输出pizza制作流程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
