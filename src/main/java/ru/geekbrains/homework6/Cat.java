package ru.geekbrains.homework6;

public class Cat extends Animal{
    int counts;

    public Cat(String name) {
        this.name = name;
        this.maxrundistance = 200;
        this.maxswimdistance = 0;
        counts++;
    }
}
