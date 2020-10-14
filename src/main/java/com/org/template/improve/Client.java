package com.org.template.improve;

/**
 * 模板方法钩子方法
 */
public class  Client {
    public static void main(String[] args) {
        System.out.println("---------制作红豆豆浆----------");
        SoyaMilk redBeabSoyaMilk = new RedBeabSoyaMilk();
        redBeabSoyaMilk.make();

        System.out.println("--------制作花生豆浆---------");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        System.out.println("-------制作纯豆浆------");

        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
