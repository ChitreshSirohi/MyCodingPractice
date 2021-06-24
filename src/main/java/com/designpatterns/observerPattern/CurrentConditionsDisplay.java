package com.designpatterns.observerPattern;

public class CurrentConditionsDisplay implements WeatherObserver,DisplayElement{

    private double temperature;
    private double humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerWeatherObserver(this);
    }
    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public void update() { //Pull method
        temperature = this.weatherData.getTemperature();
        humidity = this.weatherData.getHumidity();
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", weatherData=" + weatherData +
                '}';
    }
}
