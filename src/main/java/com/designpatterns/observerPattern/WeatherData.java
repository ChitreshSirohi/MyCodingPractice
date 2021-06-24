package com.designpatterns.observerPattern;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements WeatherSubject{
    private Set<WeatherObserver> observers = new HashSet<>();
    public double getTemperature(){
        return Math.random();
    }

    public double getHumidity(){
        return Math.random();
    }

    public double getPressure(){
        return Math.random();
    }

    public void measurmentsChanged(){
        notifyWeatherObservers();
    }

    @Override
    public void registerWeatherObserver(final WeatherObserver weatherObserver) {
        this.observers.add(weatherObserver);
    }

    @Override
    public boolean removeWeatherObserver(final WeatherObserver weatherObserver) {
        return false;
    }

    @Override
    public void notifyWeatherObservers() {
            this.observers.forEach(weatherObserver -> weatherObserver.update());
    }
}
