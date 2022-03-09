package org.sparta.mv.Day1;

import java.io.PrintStream;

public class Dog extends Animal {
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void speak(String owner) {
        PrintStream var10000 = System.out;
        String var10001 = this.getName();
        var10000.println(var10001 + " speaks to his owner, " + owner);
    }
}
