package com.org.template.normal;

public class  Client {
    public static void main(String[] args) {
        System.out.println("---------制作红豆豆浆----------");
        SoyaMilk redBeabSoyaMilk = new RedBeabSoyaMilk();
        redBeabSoyaMilk.make();

        System.out.println("--------制作花生豆浆---------");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
