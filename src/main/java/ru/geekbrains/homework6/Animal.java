package ru.geekbrains.homework6;

public abstract class Animal {
    String name;
    int maxrundistance;
    int maxswimdistance;
    int counts;

    public Animal() {
        counts++;
    }

    public void swim (int distance) {
        if (maxswimdistance == 0) {
            System.out.println(name + " не умеет плавать");
        } else if (distance >= maxswimdistance) {
            System.out.println(name + "не смог проплыть дистанцию");
        } else {
            System.out.println(name + " проплыл " + distance + " м");
        }
    }

    public void run (int distance) {
        if (distance >= maxrundistance) {
            System.out.println(name + " не смог пробежать дистанцию");
        } else {
            System.out.println(name + " пробежал " + distance + " м");
        }
    }
}
