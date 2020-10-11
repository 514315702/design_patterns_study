package com.org.prototype.base;

public class Client {
    public static void main(String[] args) {
       //传统的方法，添加属性的时候，需要改所有的属性
        Sheep sheep_1 = new Sheep("tom", 1, "白色");
        Sheep sheep_2 = new Sheep(sheep_1.getName(), sheep_1.getAge(), sheep_1.getColor());
        Sheep sheep_3 = new Sheep(sheep_1.getName(), sheep_1.getAge(), sheep_1.getColor());
        System.out.println(sheep_1);
        System.out.println(sheep_2);
        System.out.println(sheep_3);
    }
}
