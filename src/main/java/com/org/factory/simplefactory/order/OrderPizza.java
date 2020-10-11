package com.org.factory.simplefactory.order;

import com.org.factory.simplefactory.pizza.CheesePizza;
import com.org.factory.simplefactory.pizza.GreekPizza;
import com.org.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    /*public OrderPizza(){
        Pizza pizza = null;
        String orderType;//订购类型
        do {
            orderType = getType();
            if (orderType.equals("greek")){
                pizza = new GreekPizza();
            }else if (orderType.equals("cheese")){
                pizza = new CheesePizza();
            }else {
                break;
            }
            //输出pizza制作流程
            pizza.setName(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }*/
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory ){
        String orderType = ""       ; //用户输入
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购pizza失败");
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
