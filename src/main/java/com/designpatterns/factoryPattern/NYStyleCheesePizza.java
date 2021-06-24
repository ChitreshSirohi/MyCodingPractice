package com.designpatterns.factoryPattern;

public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza(){
        this.name = "NY Style sauce and Cheese Pizza";
        this.dough = "Thin crust Dough";
        this.sauce = "Marinara Sauce";

        this.toppings.add("Grated Reggiano Cheese");
    }
}
