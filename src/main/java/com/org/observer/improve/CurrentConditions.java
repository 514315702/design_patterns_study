package com.org.observer.improve;

public class CurrentConditions implements  Observer{
    private float temperature;	//温度
    private float pressure;		//气压
    private float humidity;		//湿度


    //更新天气情况，是由WeatherData来调用，使用的是推送形式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
