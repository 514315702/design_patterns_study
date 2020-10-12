package com.org.facade;

public class Client {

    //直接调用很麻烦，所以外观模式
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("----------------");
        homeTheaterFacade.play();
        System.out.println("----------------");
        homeTheaterFacade.end();
    }
}
