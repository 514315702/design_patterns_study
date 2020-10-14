package com.org.command;

//创建命令
public interface Command {

    //执行某个操作
    public void execute();

    //撤销某个操作
    public void undo();
}
