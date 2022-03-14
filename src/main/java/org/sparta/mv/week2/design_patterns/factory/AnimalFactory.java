package org.sparta.mv.week2.design_patterns.factory;

import java.util.Locale;

public class AnimalFactory {
    public static Speaker getAnimal(Animal animal){
        switch (animal.toString().toLowerCase(Locale.ROOT)){
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "goldfish":
                return new Goldfish();
            default:
                return null;
        }

    }
}
