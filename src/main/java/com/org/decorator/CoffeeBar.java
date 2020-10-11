package com.org.decorator;

public class CoffeeBar {

    //装饰者模式下下订单
    public static void main(String[] args) {

        Drink order = new LongBlack();
        System.out.println("order -> 费用  = "+ order.cost());
        System.out.println("order -> 描述  = "+ order.getDescribe());
        order  = new Milk(order);
        System.out.println("order -> 费用  = "+ order.cost());
        System.out.println("order -> 描述  = "+ order.getDescribe());

    }
}
