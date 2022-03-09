package org.sparta.mv.Day1;


public abstract class Animal {
    private String name;
    private String breed;
    private int age;

    public void speak() {
        System.out.println("An animal is speaking");
    }

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{name='" + this.name + "', breed='" + this.breed + "', age=" + this.age + "}";
    }
}
