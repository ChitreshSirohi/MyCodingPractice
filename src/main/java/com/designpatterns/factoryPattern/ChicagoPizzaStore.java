package com.designpatterns.factoryPattern;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(final PizzaType type) {
        if(type.equals(PizzaType.CHEESE)){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
