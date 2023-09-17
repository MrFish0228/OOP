package ru.geekbrains.lesson7.observer;

import java.util.List;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    List<Observer> sendOffer(Vacancy vacancy);

}
