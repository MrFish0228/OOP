package ru.geekbrains.lesson7.observer;

public class Master extends Worker {

    private static final int GRADE = 2;

    public Master(String name) {
        super(name, GRADE);
        minSalary = random.nextDouble(60000, 80000);
    }

}