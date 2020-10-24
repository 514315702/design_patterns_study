package com.org.stategy.improve;

public class WildDuck extends Duck {


	public WildDuck() {
		flyBehavior = new GoodFlyBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这是野鸭");
	}

}
