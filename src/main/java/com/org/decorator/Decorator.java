package com.org.decorator;

public class Decorator extends Drink{
    private Drink drink;

    public Decorator(Drink drink) {

        //组合的关系
        this.drink = drink;
    }

    @Override
    public float cost() {
            //super.getPrice()为它自己的价格
            return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescribe() {
        return super.getDescribe()+"  "+super.getPrice() +"&&" +drink.getDescribe();
    }
}
