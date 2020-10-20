package com.org.observer.nomal;

/**
 * 观察者模式  不用设计模式的方式
 */
public class Client {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();

		WeatherData weatherData = new WeatherData(currentConditions);
		
		weatherData .setData(30, 150, 40);
		
		System.out.println("=========================");
		weatherData.setData(40, 160, 20);
		

	}
}
