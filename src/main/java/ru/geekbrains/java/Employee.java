package ru.geekbrains.java;

public class Employee {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullname, String position, String email, String phone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(fullname);
        System.out.println(position);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(salary);
        System.out.println(age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }
}
