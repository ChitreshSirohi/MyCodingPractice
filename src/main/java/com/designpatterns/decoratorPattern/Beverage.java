package com.designpatterns.decoratorPattern;

public abstract class Beverage {
    String description = "UnknownBeverage";

    public abstract double cost();
    public String getDescription() {
        return this.description;
    }
}
