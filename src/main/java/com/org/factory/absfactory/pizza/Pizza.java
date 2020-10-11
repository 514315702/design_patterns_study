package com.org.factory.absfactory.pizza;


public abstract class Pizza {


    protected String name;  //pizz名字
    //准备原材料

    public abstract void prepare();

    public void bake(){
        System.out.println(name+"baking;");
    }

    //切割
    public void cut(){
        System.out.println(name+"cuting;");
    }
    //打包
    public void box(){
        System.out.println(name+"boxing;");
    }
    public void setName(String name) {
        this.name = name;
    }
}
