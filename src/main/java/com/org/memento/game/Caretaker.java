package com.org.memento.game;

//守护者对象，保存游戏角色对象
public class Caretaker {
    //只保存一次对象
    private Memento memento;
    //对多个游戏角色保存多次状态List或者map


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
