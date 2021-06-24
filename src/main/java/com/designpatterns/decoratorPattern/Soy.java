package com.designpatterns.decoratorPattern;

public class Soy extends CondimentDecorator
{
    public Soy(final Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost()+.15;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+", Soy";
    }
}
