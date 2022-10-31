package com.example.dz2.zadanie1;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Dima", "Yasinitskiy", "PKS-419", 4.5);
        Aspirant asp1 = new Aspirant("Shadow", "Fiend", "PKS-419", 5, "extreme");
        Student[] students = { st1, asp1 };

        for (Student s : students)
            System.out.println(s.getScholarship());


    }
}