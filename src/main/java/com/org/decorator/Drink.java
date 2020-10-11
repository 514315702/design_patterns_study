package com.org.decorator;

public abstract class Drink {

    private String describe; //；面熟
    private float price = 0.0f;    //价格


    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    //计算费用的方法
    public abstract float cost();

}
