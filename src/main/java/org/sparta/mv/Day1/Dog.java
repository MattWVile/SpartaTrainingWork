package org.sparta.mv.Day1;

import java.io.PrintStream;

public class Dog extends Animal {
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public static String speak(String owner, Dog dog) {
        PrintStream var10000 = System.out;
        String var10001 = dog.getName();
        return var10001 + " speaks to his owner, " + owner;
    }
}
