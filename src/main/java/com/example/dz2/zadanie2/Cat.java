package com.example.dz2.zadanie2;

public class Cat extends Animal {
    String race;

    public Cat(String food, String location, String race) {
        super(food, location);
        this.race = race;
    }

    public void makeNoise() {
        System.out.println("Мяуууу");
    }

    public void eat() {
        System.out.println("Кошка кушает");
    }

}
