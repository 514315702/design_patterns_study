package com.org.command;

public class RemoteController {

    private Command [] onCommands;
    private Command [] offCommands;

    Command undoCommand;

    public RemoteController() {
        onCommands =  new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给按钮设置你的命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;

    }

    //按下开按钮
    public void onButtonWasPushed(int no){
        //找到你按下开的按钮，并调用方法
        onCommands[no].execute();
        //记录这一次的操作用于撤销
        undoCommand = onCommands[no];
    }

    //按下关的按钮
    public void offButtonWasPushed(int no){
        //找到你按下开的按钮，并调用方法
        offCommands[no].execute();
        //记录这一次的操作用于撤销
        undoCommand = offCommands[no];
    }

    public void UndoButtonWasPushed(){
        undoCommand.undo();
    }
}