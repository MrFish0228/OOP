package ru.geekbrains.lesson3.task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee, метод должен генерировать
     * случайного сотрудника типа Worker или Freelancer
     * 
     * @return
     */
    public static Employee generateEmployee(int counter) {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };

        int salaryIndex = random.nextInt(500, 900);
        int age = random.nextInt(22, 35);
        int WorkingHours = random.nextInt(10, 50);

        if (counter == 1) {
            return new Worker(surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    age, salaryIndex * 100);
        } else {
            return new Freelancer(surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    age, WorkingHours, salaryIndex);
        }

        // Employee[] employes = {
        // new Freelancer(surnames[random.nextInt(surnames.length)],
        // names[random.nextInt(names.length)],
        // age, WorkingHours, salaryIndex),
        // new Worker(surnames[random.nextInt(surnames.length)],
        // names[random.nextInt(names.length)], age,
        // salaryIndex * 100)
        // };

        // return employes;
    }

    public static Employee[] generateWorkers(int counter) {
        Employee[] workers = new Worker[counter];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = generateEmployee(1);
        }
        return workers;
    }

    public static Employee[] generateFreelancers(int counter) {
        Employee[] freelancers = new Freelancer[counter];
        for (int i = 0; i < freelancers.length; i++) {
            freelancers[i] = generateEmployee(2);
        }
        return freelancers;
    }

    public static void main(String[] args) {

        Employee[] workers = generateWorkers(12);

        for (Employee worker : workers) {
            System.out.println(worker);
        }

        Employee[] freelancers = generateFreelancers(12);

        for (Employee freelancer : freelancers) {
            System.out.println(freelancer);
        }

        Arrays.sort(workers);
        Arrays.sort(freelancers);

        System.out.println();

        for (Employee worker : workers) {
            System.out.println(worker);
        }
        for (Employee freelancer : freelancers) {
            System.out.println(freelancer);
        }
    }
}
