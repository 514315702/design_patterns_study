package com.org.singleton;

/**
 * 饿汉式
 */

public class SingletonType1 {
    public static void main(String[] args) {
/**
 * 测试方法
 * SingletonTypeA singletonTypeA_1 = SingletonTypeA.getInstance();
 * SingletonTypeA singletonTypeA_2 = SingletonTypeA.getInstance();
 * System.out.println(singletonTypeA_1 == singletonTypeA_2);
 * System.out.println(singletonTypeA_1.hashCode());
 * System.out.println(singletonTypeA_2.hashCode());
 */
    }
}

/**
 * 静态变量
 * 优点：写法简单，在类装在的时候就完成实例化，避免了线程同步问题
 * 缺点：没有达到懒加载的效果，如果从未使用，则造成内存浪费
 *
 */
class SingletonTypeA{

    private final  static  SingletonTypeA singletonTypeA = new SingletonTypeA();

    private SingletonTypeA(){}

    public static SingletonTypeA getInstance(){
        return singletonTypeA;
    }
}

/**
 * 静态代码块
 * 优点：写法简单，在类装在的时候就完成实例化，避免了线程同步问题
 * 缺点：没有达到懒加载的效果，如果从未使用，则造成内存浪费
 *
 */
class SingletonTypeB{

    private  static  SingletonTypeB singletonTypeB;

    static {
        singletonTypeB = new SingletonTypeB();
    }

    private SingletonTypeB(){}

    public static SingletonTypeB getInstance(){
        return singletonTypeB;
    }
}