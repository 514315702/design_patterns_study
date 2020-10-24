package com.org.memento.theory;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    //获取到第index个Originator 的备忘录对象
    public Memento get(int index){
        return mementoList.get(index);
    }
}
