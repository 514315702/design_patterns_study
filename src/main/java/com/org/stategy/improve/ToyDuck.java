package com.org.stategy.improve;

public class ToyDuck extends Duck {

	public ToyDuck() {
		flyBehavior = new NoFlyBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("���Ѽ");
	}


	public void quack() {
		System.out.println("���Ѽ���ܽ�~~");
	}
	
	public void swim() {
		System.out.println("���Ѽ������Ӿ~~");
	}
	
}
