package com.org.command;

/**
 * 没有任何命令 即空执行，用于初始化每个按钮，当调用空命令时，对象什么都不做
 *
 */
public class NoCommand implements Command{
    public void execute() {

    }

    public void undo() {

    }
}
