package ru.geekbrains.homework7;

public class Plate {
    private int food;
    private int maxfood = 20; //Максимальное количество еды на тарелке

    public Plate(int food) {
        if (food > maxfood) {
            System.out.println("В тарелку поместилость только " + maxfood + " еды");
            this.food = maxfood;
            return;
        }
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void increaseFood(int amount) {
        if (food + amount > maxfood) {
            System.out.println("В тарелку поместилость только " + maxfood + " еды");
            food = maxfood;
            return;
        }
        food += amount;
        System.out.println("В тарелку добавили " + amount + " еды");
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void info() {
        System.out.printf("Plate: [ Food: %d ]\n", food);
    }
}
