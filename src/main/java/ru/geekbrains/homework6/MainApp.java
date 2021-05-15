package ru.geekbrains.homework6;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Garfield");
        Dog dog1 = new Dog("Tuzik");

        cat1.run(157);
        dog1.run(257);
        cat1.swim(157);
        dog1.swim(5);


    }
}
