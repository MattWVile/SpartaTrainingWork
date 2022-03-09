package org.sparta.mv.Day1;

public class Cat extends Animal {
    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void speak() {
        System.out.println(this.getName() + " Purrs");
    }
}

