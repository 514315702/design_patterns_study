package com.org.singleton;

/**
 * 双重检查
 */
public class SingletonType3 {
    public static void main(String[] args) {

    }
}

/**
 * 解决线程安全，同时解决懒加载,同时保证效率
 */
class SingletonType3A{
    private static volatile SingletonType3A singletonType3A;

    private SingletonType3A(){}

    public static SingletonType3A getInstance(){
        //多线程下不安全
        if(singletonType3A == null){
            synchronized (SingletonType3A.class){
                if(singletonType3A == null){
                    singletonType3A = new SingletonType3A();
                }
            }

        }
        return singletonType3A;
    }
}