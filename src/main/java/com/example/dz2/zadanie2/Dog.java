package com.example.dz2.zadanie2;

public class Dog extends Animal {

    String color;
    public Dog (String food, String location, String color) {
        super(food, location);

        this.color = color;
    }

    public void makeNoise() {
        System.out.println("Гав-гав");
    }

    public void eat() {
        System.out.println("Собака кушает");
    }

}
