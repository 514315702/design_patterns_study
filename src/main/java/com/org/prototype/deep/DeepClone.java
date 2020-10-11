package com.org.prototype.deep;

import java.io.Serializable;

public class DeepClone implements Serializable,Cloneable {


    private String cloneName;
    private String cloneClass;

    public DeepClone(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //该类属性都是字符串，默认克隆即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
