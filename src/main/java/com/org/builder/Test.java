package com.org.builder;

public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("hallo");


        //Appendable  //接口定义多个append方法，抽象建造者
        //AbstractStringBuilder 实现了Appendable 接口方法 这里是建造者

        //StringBuild 既充当了指挥者同时充当了建造者，建造方法由AbstractStringBuilder完成

    }
}
