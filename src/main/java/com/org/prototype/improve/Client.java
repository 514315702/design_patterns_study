package com.org.prototype.improve;

/**
 * spring 中 创建实例的时候，prototype 为原型模式
 * prototype
 * single
 * request
 * session
 * globle_sesion
 *
 *
 */

public class Client {
    public static void main(String[] args) {
        //原型模式完成对象的创建
        Sheep sheep_1 = new Sheep("tom", 1, "白色");
        sheep_1.setFriend(new Sheep("jack",2,"黑色"));

        Sheep sheep_2=(Sheep) sheep_1.clone();
        Sheep sheep_3=(Sheep) sheep_1.clone();
        Sheep sheep_4=(Sheep) sheep_1.clone();

        System.out.println(sheep_1 + "----friend"+sheep_1.getFriend().hashCode());
        System.out.println(sheep_2 + "----friend"+sheep_1.getFriend().hashCode());
        System.out.println(sheep_3 + "----friend"+sheep_1.getFriend().hashCode());

    }

}
