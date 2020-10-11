package com.org.builder.improve;

public class CommonHouse extends HouseBuilder{
    public void buildBasic() {
        System.out.println("给普通房子打地基5米");
    }

    public void buildWalls() {
        System.out.println("给普通房子砌墙10cm");
    }

    public void roofed() {
        System.out.println("给普通房子封顶");
    }

}
