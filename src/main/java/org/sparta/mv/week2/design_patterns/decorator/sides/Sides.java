package org.sparta.mv.week2.design_patterns.decorator.sides;
import org.sparta.mv.week2.design_patterns.decorator.pizza.Pizza;

public abstract class Sides extends Pizza {
    protected Pizza pizza;
    //children can access
    public Sides (Pizza pizza){
        this.pizza = pizza;
    }
    public abstract String getDescription();
}
