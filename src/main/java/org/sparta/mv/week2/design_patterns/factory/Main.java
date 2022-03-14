package org.sparta.mv.week2.design_patterns.factory;

public class Main {
    public static void main(String[] args) {
        Speaker myDog = AnimalFactory.getAnimal(Animal.CAT);
        System.out.println(myDog.speak());
        
    }
}
