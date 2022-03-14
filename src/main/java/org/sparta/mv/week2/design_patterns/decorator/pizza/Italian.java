package org.sparta.mv.week2.design_patterns.decorator.pizza;

public class Italian extends Pizza {
    @Override
    public String getDescription() {
        return "Italian Pizza";
    }

    @Override
    public double getCost() {
        return 20;
    }
}
