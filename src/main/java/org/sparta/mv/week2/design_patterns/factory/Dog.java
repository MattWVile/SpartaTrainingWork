package org.sparta.mv.week2.design_patterns.factory;

public class Dog implements Speaker{
    @Override
    public String speak() {
        return "woof";
    }
}
