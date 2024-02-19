package org.raul.lesson_4.inheritance.model;

import org.raul.lesson_4.inheritance.utils.Plate;

/* 1.Создать классы Собака и Кот с наследованием
от класса Животное.*/
public class Cat extends Animal {
    private static int instanceCountCat = 0;
    private int hunger;
    private boolean isSatiate = false;

    /* 5.2.a.Каждому коту нужно добавить поле сытость
    (когда создаем котов, они голодны).*/
    public Cat(String name, int hunger) {
        super(name);
        this.hunger = hunger;
        instanceCountCat++; /* Couldn't use this() here because both
        super and this should be first. */
    }

    public static int getInstanceCountCat() {
        return instanceCountCat;
    }

    public int getHunger() {
        return hunger;
    }

    public boolean isSatiate() {
        return isSatiate;
    }

    @Override
    public void run(int distanceMeters) {
        /* 3.У каждого животного есть
        ограничения на действия.*/
        runningThreshold = 200;

        if (distanceMeters <= 0) {
            System.out.println("The distance shouldn't be zero or negative!");
            return;
        }

        if (distanceMeters > runningThreshold) {
            System.out.println("Warning: " + displayAnimalType() + "'s run capacity is up to " + runningThreshold + " meters.");
        } else {
            System.out.println(displayAnimalType() + " " + getName() + " ran " + distanceMeters + "m _ _ _\uD83D\uDC08_");
        }
    }

    @Override
    public void swim(int distanceMeters) {
        /* 3.У каждого животного есть ограничения
        на действия - кот не умеет плавать.*/
        swimmingThreshold = 0;
        System.out.println("I am a " + displayAnimalType() + "\uD83D\uDC31 and I hate swimming :/");
    }

    public void eat(Plate plate) {
        System.out.println("Plate: " + plate.getFeed());

        /* 5.2.b.Если коту удалось покушать (хватило еды),
        сытость = true. */
        if (plate.getFeed() >= hunger) {
            isSatiate = true;
        }
        plate.feedConsumption(hunger);
    }
}
