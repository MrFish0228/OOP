package ru.geekbrains.lesson4.homework;

public class Program {

    /**
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются
     * по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес
     * одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить
     * текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в
     * противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в
     * другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с
     * апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую
     * перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     *
     * Формат сдачи: ссылка на гитхаб проект
     * 
     * @param args
     */
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        System.out.println("У нас есть 4 коробки:\n" + "C апельсинами №1\n" + "Апельсины №2\n" +
                "С яблоками №1\n" + "И с яблоками №2\n");

        System.out.println("Положим в первую коробку - 10 апельсинов");
        orangeBox.addFruit(new Orange(), 10);
        System.out.println("Положим во вторую коробку - 12 апельсинов");
        orangeBox2.addFruit(new Orange(), 12);
        System.out.println("Положим в третью коробку - 8 яблок");
        appleBox.addFruit(new Apple(), 8);
        System.out.println("Положим в четвертую коробку - 4 яблока");
        appleBox2.addFruit(new Apple(), 4);

        System.out.println("Вес первой коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBox2.getWeight());
        System.out.println("Вес первой коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес второй коробки с яблоками: " + appleBox2.getWeight());

        System.out.println("Сравниваем коробки по весу - независимо от их содержимого");

        System.out.println("Коробка апельсинов №1 и коробка яблок №1 " + orangeBox.compare(appleBox));
        System.out.println("Коробка апельсинов №2 и коробка яблок №2 " + orangeBox2.compare(appleBox2));

        System.out.println("Пересыпаем апельсины из первой коробки во вторую");
        orangeBox.pourTo(orangeBox2);
        System.out.println("Пересыпаем яблоки из первой коробки во вторую");
        appleBox.pourTo(appleBox2);
        System.out.println("Вес коробок после пересыпания фруктов:");
        System.out.println("Вес коробки апельсинов №1: " + orangeBox.getWeight());
        System.out.println("Вес коробки апельсинов №2: " + orangeBox2.getWeight());
        System.out.println("Вес коробки яблок №1: " + appleBox.getWeight());
        System.out.println("Вес коробки яблок №2: " + appleBox2.getWeight());

    }
}