package com.org.builder.improve;

/**
 * 抽象建造者
 */
public abstract class  HouseBuilder {
    protected House house = new House();

    //打地基
    public abstract  void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract  void roofed();

    public House build(){
        return  house;
    }
}
