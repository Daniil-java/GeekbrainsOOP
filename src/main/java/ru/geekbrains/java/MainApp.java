package ru.geekbrains.java;

public class MainApp {
    public static void main(String[] args) {
        Employee[] employArr = new Employee[5];
        employArr[0] = new Employee("Бугров Василий Иванович", "Engineer", "notaemail@gmail.ru", "+79875346598", 75600, 41);
        employArr[1] = new Employee("Антипин Скрипт Игоревич", "Manager", "manager@gmail.ru", "+79875346598", 75600, 42);
        employArr[2] = new Employee("Петров Василий Дмитриевич", "Engineer", "notal@gmail.ru", "+79875346598", 75600, 30);
        employArr[3] = new Employee("Фёдоров Николай Васильевич", "Engineer", "no@gmail.ru", "+79875346598", 75600, 28);
        employArr[4] = new Employee("Серова Валентина Ивановна", "Lawyer", "lawyer@gmail.ru", "+79875346598", 75600, 32);

        for (int i = 0; i < employArr.length; i++) {
            if (employArr[i].getAge() > 40) {
                employArr[i].info();
            }
        }
    }
}
