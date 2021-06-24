package com.designpatterns.factoryPattern;

public abstract class PizzaStore {
    public enum PizzaType{
        CHEESE;
    }
    public Pizza orderPizza(PizzaType type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(PizzaType type);
}
