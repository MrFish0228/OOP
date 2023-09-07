package ru.geekbrains.lesson3.task2;

public class Worker extends Employee {

    public Worker(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d лет; Рабочий; Среднемесячная заработная плата (фиксированная): %.2f",
                surName, name, age, calculateSalary());
    }
}
