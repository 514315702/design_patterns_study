package com.org.mediator.smarthouse;

public abstract class Mediator {
	//将中介者对象
	public abstract void Register(String colleagueName, Colleague colleague);

	//������Ϣ, �����ͬ�¶��󷢳�
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}
