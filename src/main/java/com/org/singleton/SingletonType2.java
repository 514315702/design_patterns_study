package com.org.singleton;

/**
 * 懒汉式
 */
public class SingletonType2 {
    public static void main(String[] args) {

    }
}

/**
 * 线程不安全
 */
class SingletonType2A{
    private static  SingletonType2A singletonType2A;

    private SingletonType2A(){}

    public static SingletonType2A getInstance(){
        //多线程下不安全
        if(singletonType2A == null){
            singletonType2A = new SingletonType2A();
        }
        return singletonType2A;
    }
}

/**
 * 线程安全
 * 效率太低:只需要创建一次实例，但是每个线程都会同步
 */
class SingletonType2B{
    private static  SingletonType2B singletonType2B;

    private SingletonType2B(){}


    public static synchronized SingletonType2B getInstance(){
        if(singletonType2B == null){
            singletonType2B = new SingletonType2B();
        }
        return singletonType2B;
    }
}

/**
 * 线程不安全（不可用）
 */
class SingletonType2C{
    private static  SingletonType2C singletonType2C;

    private SingletonType2C(){}


    public static synchronized SingletonType2C getInstance(){
        if(singletonType2C== null){

            synchronized(SingletonType2C.class){
                singletonType2C= new SingletonType2C();
            }
        }
        return singletonType2C;
    }
}
