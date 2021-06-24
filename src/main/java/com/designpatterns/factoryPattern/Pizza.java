package com.designpatterns.factoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class  Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing "+ this.name);
        System.out.println("Tossing dough "+ this.dough);
        System.out.println("Adding sauce "+ this.sauce);
        System.out.println("Adding toppings");
        this.toppings.forEach(System.out::println);
    }

    void bake(){
        System.out.println("Bake for 25 min");
    }
    void cut(){
        System.out.println("Cutting into slices");
    }
    void box(){
        System.out.println("Placing pizza in official PizzaStore box");
    }

}
