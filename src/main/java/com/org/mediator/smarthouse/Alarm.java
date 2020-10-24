package com.org.mediator.smarthouse;

//具体的同时类
public class Alarm extends Colleague {

	//构造器
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//在创建ALarm对象时将自己放入到concratemediator 对象中
		mediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
		// TODO Auto-generated method stub
		//调用中介者对象的getmessage
		this.GetMediator().GetMessage(stateChange, this.name);
	}

}
