package ru.geekbrains.lesson7.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Worker implements Observer {
    protected final String name;
    protected double minSalary;
    protected static final Random random = new Random();
    private final int GRADE;
    private static final Map<Integer, String> workersMap = new HashMap<>() {
        {
            put(1, "Професионал");
            put(2, "Мастер");
            put(3, "Студент");
        }
    };

    public Worker(String name, int grade) {
        this.name = name;
        GRADE = grade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMinSalary() {
        return minSalary;
    }

    @Override
    public int getGRADE() {
        return GRADE;
    }

    @Override
    public boolean receiveOffer(Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()) {
            System.out.printf("%s %s (%.2f) >>> Мне нужна эта работа! [%s - %.2f]\n",
                    workersMap.get(GRADE), name, minSalary, vacancy, vacancy.getSalary());
            return true;
        }
        System.out.printf("%s %s >>> Я найду работу получше (%.2f)! [%s - %.2f]\n",
                workersMap.get(GRADE), name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
        return false;
    }
}