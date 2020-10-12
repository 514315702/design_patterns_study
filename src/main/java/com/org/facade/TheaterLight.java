package com.org.facade;

public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    private TheaterLight(){}

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");
    }

    public void bright(){
        System.out.println("灯光更亮");
    }

    public void dim(){
        System.out.println("灯光更暗");
    }
}
