package com.org.facade;

public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer(){}

    public static  DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD on");
    }

    public void off(){
        System.out.println("DVD off");
    }

    public  void play(){
        System.out.println("DVD is play");
    }

    public void pause(){
        System.out.println("DVD 暂停");
    }
}
