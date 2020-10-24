package com.org.stategy.improve;

public class PekingDuck extends Duck {

	public PekingDuck() {
		flyBehavior = new BadFlyBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这是北京鸭");
	}

}
