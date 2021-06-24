package com.designpatterns.decoratorPattern;

public class Mocha extends CondimentDecorator{

    public Mocha(final Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+", Mocha";
    }
}
