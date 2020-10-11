package com.org.bridge;

public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立的手机开机");
    }

    public void close() {
        super.close();
        System.out.println("直立的手机关机");
    }

    public void call() {
        super.call();
        System.out.println("直立的手机打电话");
    }
}
