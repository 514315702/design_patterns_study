package com.org.builder.improve;


/**
 * 动态的制定建造流程
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //构造器传入或者通过set方法
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public  House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.build();
    }
}
