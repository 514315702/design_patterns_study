package com.org.facade;

public class Popcorn {

    private static Popcorn instance = new Popcorn();

    private Popcorn(){}

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Popcorn on");
    }

    public void off(){
        System.out.println("Popcorn off");
    }

    public void pop(){
        System.out.println("正在出爆米花");
    }
  }
