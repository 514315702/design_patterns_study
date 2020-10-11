package com.org.builder.improve;

public class client {

    public static void main(String[] args) {
        CommonHouse commonHouse  = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成盖房，返回产品
        House house = houseDirector.constructHouse();

        System.out.println("------------------");
        //盖高楼
        HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);
        House house2 = houseDirector.constructHouse();
    }
}
