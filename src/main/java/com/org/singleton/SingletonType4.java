package com.org.singleton;

/**
 * 静态内部类
 */
public class SingletonType4 {
    public static void main(String[] args) {

    }
}

class  SingletonType4A{

    private SingletonType4A(){}


    /**
     * 1.外部类装载时候，静态内部类不会被装载
     * 2.只有调用时候，会导致静态内部类装载，而且只会装载一次，也是线程安全的
     */
    private static class SingletonType4AInstance{
        private static final SingletonType4A singletonType4A= new SingletonType4A();
    }

    public static SingletonType4A getInstance(){
        return SingletonType4AInstance.singletonType4A;
    }
}

