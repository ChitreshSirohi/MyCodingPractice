package com.designpatterns.factoryPattern;

public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza(){
        this.name = "Chicago Style sauce and Cheese Pizza";
        this.dough = "Extra thick crust Dough";
        this.sauce = "Plum tomato Sauce";

        this.toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
