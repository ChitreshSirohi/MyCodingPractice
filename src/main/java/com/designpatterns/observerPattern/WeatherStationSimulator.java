package com.designpatterns.observerPattern;

public class WeatherStationSimulator {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.measurmentsChanged();
    }
}
