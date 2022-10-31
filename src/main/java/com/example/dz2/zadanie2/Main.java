package com.example.dz2.zadanie2;

import com.example.dz2.zadanie1.Aspirant;
import com.example.dz2.zadanie1.Student;

public class Main {
    public static void main(String[] args){

        Veterenar Veterenar = new Veterenar();
        Dog Dog1 = new Dog("Мясо", "Будка", "Белый");
        Cat Cat1 = new Cat("Рыба", "Кошачий дом", "Вислоухая");
        Horse Horce1 = new Horse("Сено", "Конюшня", "Игогошка");

        Animal[] animals = {Dog1, Cat1, Horce1};

        for (Animal s : animals)
            Veterenar.treatAnimal(s);


    }
}

