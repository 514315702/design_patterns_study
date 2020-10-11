package com.org.adapter.objectAdpter;


/**
 * 适配器类
 */
public class VoltageAdapter implements Voltage5 {


    private Voltage220 voltage220;

    /**
     * 通过构造器传入电压
     * @param voltage220
     */
    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    public int output5() {
        int dstV = 0;
        if(null !=  voltage220){
            int src =  voltage220.output220();
            dstV = src/44; //转化成5V电压
            System.out.println("适配完成");
        }
        return dstV;
    }
}
