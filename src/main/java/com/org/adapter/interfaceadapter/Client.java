package com.org.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void mothed_1() {
                super.mothed_1();
                System.out.println("实现方法");
            }
        };
        absAdapter.mothed_1();

    }
}
