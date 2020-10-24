package com.org.memento.theory;

public class Originator {

    private String state;   //状态

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //编写一个方法，保存一个状态对象
    public Memento  saveStateMemento(){
        return new Memento(state);
    }

    //通过备忘录对象，恢复状态
    public void getStateFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
