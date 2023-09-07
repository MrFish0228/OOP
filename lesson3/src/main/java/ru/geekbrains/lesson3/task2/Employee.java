package ru.geekbrains.lesson3.task2;

/**
 * Сотрудник
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Имя
     */
    protected String name;
    /**
     * Возраст
     */
    protected int age;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    public abstract double calculateSalary();

    public Employee(String surName, String name, int age, double salary) {
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int res = surName.compareTo(o.surName);
        if (res == 0) {
            return name.compareTo(o.name);
        }
        return res;
    }
}
