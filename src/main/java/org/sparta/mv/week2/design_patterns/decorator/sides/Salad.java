package org.sparta.mv.week2.design_patterns.decorator.sides;

import org.sparta.mv.week2.design_patterns.decorator.pizza.Pizza;

public class Salad extends Sides {

    public Salad(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and salad";

    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }
}
