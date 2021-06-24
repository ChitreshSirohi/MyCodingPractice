package com.designpatterns.observerPattern;

public interface WeatherSubject {
    void registerWeatherObserver(WeatherObserver weatherObserver);
    boolean removeWeatherObserver(WeatherObserver weatherObserver);
    void notifyWeatherObservers();
}
