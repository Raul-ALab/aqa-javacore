package org.raul.lesson_3;

/* 1.Создать класс "Сотрудник" с полями: ФИО, должность,
email, телефон, зарплата, возраст. */
public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;


    /* 2.Конструктор класса должен заполнять эти поля
    при создании объекта. */
    public Employee(String fullName, String position, String email, String phone, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public int getAge() {
        return age;
    }


    /* 3.Внутри класса «Сотрудник» написать метод, который
    выводит информацию об объекте в консоль. */
    public void employeeDetailsToConsole() {
        System.out.println(" full name: " + this.fullName
                + ", position: " + this.position
                + ",\n e-mail: " + this.email
                + ", phone: " + this.phone
                + ",\n salary: " + this.salary
                + ", age: " + this.age);
        System.out.println("===================");
    }
}
