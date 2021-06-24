package com.designpatterns.factoryPattern;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza(PizzaStore.PizzaType.CHEESE);
        System.out.println("Ethan ordered a "+pizza.name);
        pizza = chicagoStore.orderPizza(PizzaStore.PizzaType.CHEESE);
        System.out.println("Joel ordered a "+pizza.name);
    }
}
