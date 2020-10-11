package com.org.composite;

/**
 * 组合模式，试用于树结构
 * 节点和叶子系欸按差异较大，方法属性不同，不适合组合模式
 * 组织机构，非常适合组合模式
 *
 * 可以是类，也可以接口
 */
public abstract class OrganizationComponent {

    private String name;    //名字
    private String descibe; //说明

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected  void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String descibe) {

        this.name = name;
        this.descibe = descibe;
    }

    /**
     * 子类都需要实现
     */
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescibe() {
        return descibe;
    }

    public void setDescibe(String descibe) {
        this.descibe = descibe;
    }
}
