package ru.geekbrains.lesson7.observer;

public interface Observer {

    boolean receiveOffer(Vacancy vacancy);

    public String getName();

    public double getMinSalary();

    public int getGRADE();

}
