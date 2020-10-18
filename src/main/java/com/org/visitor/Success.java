package com.org.visitor;

public class Success extends Action{
    public void getManResult(Man man) {
        System.out.println("男人给的评价该歌手很成功！！");
    }

    public void geWomanResult(Woman woman) {
        System.out.println("女人给的评价该歌手很成功！！");
    }
}
