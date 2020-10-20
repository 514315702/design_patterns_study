package com.org.observer.improve;

import com.org.observer.nomal.CurrentConditions;

import java.util.ArrayList;

/**
 *是核心类
 * 1.包含最新的天气情况信息
 * 2.包含观察者集合，使用Arraylist
 * 3.当数据又更新时候主动的调用CurrentConditions 的update方法，这样接入方看到了最新的信息
 */
public class WeatherData  implements  Subject{
	private float temperatrue;
	private float pressure;
	private float humidity;
	private ArrayList<Observer> observers;
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}

	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void dataChange() {
		notifyObserver();
	}

	//当数据又更新时就调用setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//将最新的信息推送给接入放
		dataChange();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		if(observers.contains(o)){
			observers.remove(o);
		}

	}

	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(this.temperatrue,this.pressure,this.humidity);
		}
	}
}
