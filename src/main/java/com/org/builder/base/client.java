package com.org.builder.base;

public class client {
    public static void main(String[] args) {

        //比较好理解，但是过于简单，程序维护不好，产品和产品的创建过程封装到一起了
        //产品和产品建造过程进行解耦
        CommonHouse commonHouse  = new CommonHouse();
        commonHouse.build();
    }
}
