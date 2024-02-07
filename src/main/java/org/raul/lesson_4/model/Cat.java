package org.raul.lesson_4.model;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {
        System.out.println(displayClassType() + " and I hate swimming :(");
    }
}
