package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public List<Observer> sendOffer(Vacancy vacancy) {
        List<Observer> workerList = new ArrayList<>();
        for (Observer observer : observers) {
            if (observer.receiveOffer(vacancy)) {
                workerList.add(observer);
            }
        }
        return workerList;
    }
}
