package com.org.observer.improve;



/**
 * 观察者模式  不用设计模式的方式
 */
public class Client {
	public static void main(String[] args) {
		//创建一个WeatherData
		WeatherData weatherData= new WeatherData();

		CurrentConditions currentConditions = new CurrentConditions();
		weatherData.registerObserver(currentConditions);

		weatherData.setData(10f,20f,30f);
	}
}
