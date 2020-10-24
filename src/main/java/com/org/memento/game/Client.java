package com.org.memento.game;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setDef(100);
        gameRole.setVit(100);

        System.out.println("和boss 大战前的状态");
        gameRole.display();

        //当前状态备份
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());
        //和boss大战后
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();

        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());

        gameRole.display();

    }
}
