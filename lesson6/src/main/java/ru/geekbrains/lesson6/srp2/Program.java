package ru.geekbrains.lesson6.srp2;

public class Program {

    public static void main(String[] args) {
        Order order = new Order();
        SaveToFile.saveToJson(order);
    }

}
