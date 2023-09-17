package ru.geekbrains.lesson7.observer;

public class Professional extends Worker {

    private static final int GRADE = 1;

    public Professional(String name) {
        super(name, GRADE);
        minSalary = random.nextDouble(120000, 160000);
    }

}