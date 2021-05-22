package ru.geekbrains.homework7;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik"),
                new Cat("Tima"),
                new Cat("Jojo"),
                new Cat("Jack")
        };
        Plate plate = new Plate(50);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            while (cats[i].isHungry() == true) {
                cats[i].eat(plate);
                if (cats[i].isHungry() == true) {
                    plate.increaseFood(12);
                }
            }
            cats[i].info();
            plate.info();
        }

    }
}
