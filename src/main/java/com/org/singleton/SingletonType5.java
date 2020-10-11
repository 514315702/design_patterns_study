package com.org.singleton;

public class SingletonType5 {


    public static void main(String[] args) {
        SingletonType5A singletonType5A_1 = SingletonType5A.INSTANCE;
        SingletonType5A singletonType5A_2 = SingletonType5A.INSTANCE;
        System.out.println(singletonType5A_1 == singletonType5A_2);
    }
}

enum SingletonType5A{
    INSTANCE;   //属性
    public void method(){
        System.out.println("ok");
    }
}
