package com.org.builder.improve;

public class HighHouse extends HouseBuilder{
    public void buildBasic() {
        System.out.println("给普通房子打地基100米");
    }

    public void buildWalls() {
        System.out.println("给普通房子砌墙20cm");
    }

    public void roofed() {
        System.out.println("给高楼封顶");
    }

}
