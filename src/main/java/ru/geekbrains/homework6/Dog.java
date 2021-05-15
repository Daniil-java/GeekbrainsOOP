package ru.geekbrains.homework6;

public class Dog extends Animal {
    int counts;

    public Dog(String name) {
        this.name = name;
        this.maxrundistance = 500;
        this.maxswimdistance = 10;
        counts++;
    }
}
