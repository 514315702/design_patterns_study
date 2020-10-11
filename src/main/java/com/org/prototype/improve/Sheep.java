package com.org.prototype.improve;

public class Sheep implements Cloneable{
    private String name;
    private Integer age;
    private String color;

    private Sheep friend;       //浅拷贝：基础类型会直接赋值，引用类型，直接引用传递
                                //深拷贝：基础类型会直接赋值，引用类型直接整个对象拷贝
                                //   1.重写clone 方法
                                //   2.对象序列化实现深拷贝


    public Sheep() {
    }


    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }


    @Override
    protected Object clone()  {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
