package com.org.observer.nomal;

/**
 *是核心类
 * 1.包含最新的天气情况信息
 * 2.包含一个CurrentConditions对象
 * 3.当数据又更新时候主动的调用CurrentConditions 的update方法，这样接入方看到了最新的信息
 */
public class WeatherData {
	private float temperatrue;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;

	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
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
		//调用接入放的update
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}

	//当数据又更新时就调用setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//将最新的信息推送给接入放
		dataChange();
	}
}
