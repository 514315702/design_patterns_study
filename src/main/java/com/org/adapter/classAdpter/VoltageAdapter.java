package com.org.adapter.classAdpter;


/**
 * 适配器类
 */
public class VoltageAdapter  extends Voltage220 implements Voltage5{
    public int output5() {
        int src = output220();
        int dstV = src/44; //转化成5V电压
        return dstV;
    }
}
