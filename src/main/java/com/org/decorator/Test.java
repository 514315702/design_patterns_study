package com.org.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/**
 *  InputStream 用的就是装饰者
 */
public class Test {
    public static void main(String[] args) throws Exception {

        //说明
        // InputStream 是抽象类 ，类似于Drink
        //FileInputStream 是InputStream子类，类似 LongBlack
        //FilterInputStream是InputStream子类 ,类似前面的Decorator 修饰者
        //DataInputStream是FilterInputStream子类，类似前面的milk
        //FilterInputStream 类中有protected volatile InputStream in 含有被装饰者;
        DataInputStream dis = new DataInputStream(new FileInputStream("/盘符"));
        System.out.println(dis.read());
        dis.close();
    }
}
