package com.org.visitor;

public class Wait extends  Action {
    public void getManResult(Man man) {
        System.out.println("男人给的评价是该歌手待定。。。");
    }

    public void geWomanResult(Woman woman) {
        System.out.println("女人的评价是该歌手待定。。。");
    }
}
