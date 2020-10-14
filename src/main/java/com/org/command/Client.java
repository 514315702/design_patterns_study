package com.org.command;

public class Client {
    public static void main(String[] args) {
        //使用命令设计模式完成通过遥控器对电灯的操作

        //创建电灯的对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给我们的遥控器设置相命令
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);


        System.out.println("按下开的按钮");
        remoteController.onButtonWasPushed(0);

        System.out.println("按下关的按钮");
        remoteController.offButtonWasPushed(0);

        System.out.println("按下撤销按钮");
        remoteController.UndoButtonWasPushed();
    }
}
