package ru.geekbrains.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name) {
        this.name = name;
        this.appetite = 13;
        this.hungry = true;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            hungry = false;
            System.out.println(name + " покушал");
        } else {
            System.out.println("В тарелке мало еды");
        }
    }

    public void info() {
        if (hungry == false) {
            System.out.println(name + " сытый");
        } else {
            System.out.println(name + " голодный");
        }
    }
}
