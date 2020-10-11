package com.org.factory.factorymethod.order;


public abstract class PizzaStore {


    public static void main(String[] args) {
       //new OrderPizza();

        //pizza种类增加的时候，只需要修改factory
        new BJOrderPizza();
        System.out.println("推出程序");
    }
}
