package ru.geekbrains.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашнего задания
 */
public class Freelancer extends Employee {

    private int WorkingHours;

    public Freelancer(String surName, String name, int age, int WorkingHours, double salary) {
        super(surName, name, age, salary);
        this.WorkingHours = WorkingHours;
    }

    public String toString() {
        return String.format(
                "%s %s; %d лет; Фрилансер; Количество отработанных часов: %d; Заработная плата за отработанные часы: %.2f",
                surName, name, age, WorkingHours, calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return salary * WorkingHours;
    }

}
