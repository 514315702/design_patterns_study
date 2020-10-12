package com.org.facade;

public class Projector {

    private static Projector instance = new Projector();

    private Projector(){}

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector on");
    }

    public void off(){
        System.out.println("Projector off");
    }

    public void focue(){

        System.out.println("投影仪正在聚焦");
    }
  }
