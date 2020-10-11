package com.org.factory.absfactory.order;



public abstract class PizzaStore {


    public static void main(String[] args) {
       //new OrderPizza();

        //pizza种类增加的时候，只需要修改factory
        new OrderPizza(new BJFactory());
    }
}
