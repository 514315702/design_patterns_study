package com.org.adapter.objectAdpter;

public class Phone {

    //充电
    public void charging(Voltage5 voltage5){
        if(voltage5.output5() == 5){
            System.out.println("电压为5V 可以充电");
        }else {
            System.out.println("电压不为5V 不能充电");
        }
    }
}
