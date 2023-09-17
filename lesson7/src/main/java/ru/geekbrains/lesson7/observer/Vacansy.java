package ru.geekbrains.lesson7.observer;

public class Vacancy {
    private String companyName;
    private double salary;

    public Vacancy(String companyName, double salary) {
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getSalary() {
        return salary;
    }
}