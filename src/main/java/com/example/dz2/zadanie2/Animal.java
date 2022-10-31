package com.example.dz2.zadanie2;

public class Animal {

    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Издаёт звуки...");

    }

    public void eat() {
        System.out.println("Кушает...");
    }

    public void sleep() {
        System.out.println("Спит...");
    }
}



