package com.designpatterns.factoryPattern;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(final PizzaType type) {
        if(type.equals(PizzaType.CHEESE)){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
