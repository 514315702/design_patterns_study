package com.org.visitor;

public abstract class Action {

    //得到男性的测评结果
    public abstract void getManResult(Man man);

    //得到女性的测评结果
    public abstract void geWomanResult(Woman woman);
}
