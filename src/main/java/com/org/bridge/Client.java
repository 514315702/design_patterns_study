package com.org.bridge;

public class Client {

    public static void main(String[] args) {
        //折叠式手机
        Phone phone = new FoldedPhone(new Xiaomi());
        //Phone phone = new FoldedPhone(new Vivo());
        //Phone phone = new UpRightPhone(new Xiaomi());
        //Phone phone = new UpRightPhone(new Vivo());

        phone.open();
        phone.call();
        phone.close();



    }
}
