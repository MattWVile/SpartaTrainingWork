package org.sparta.mv.week2.design_patterns.factory;

public class Goldfish implements Speaker{
    @Override
    public String speak() {
        return "Blub Blub";
    }
    public String thinking(){
        return "Thinks intensely";
    }
}
