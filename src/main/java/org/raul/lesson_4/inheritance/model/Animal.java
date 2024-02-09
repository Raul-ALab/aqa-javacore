package org.raul.lesson_4.inheritance.model;

/* 1.Создать классы Собака и Кот с наследованием
от класса Животное.*/
public abstract class Animal {
    private String name;
    protected int runningThreshold;
    protected int swimmingThreshold;

    /* 4.* Добавить подсчет созданных котов, собак и животных. */
    private static int instanceCountAnimal = 0;

    public Animal() {
        instanceCountAnimal++;
    }

    public Animal(String name) {
        this(); // Sharing instance count for animal with other constructors
        this.name = name;
    }

    public static int getInstanceCountAnimal() {
        return instanceCountAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunningThreshold() {
        return runningThreshold;
    }

    public int getSwimmingThreshold() {
        return swimmingThreshold;
    }

    public abstract void swim(int distanceMeters);

    public void run(int distanceMeters) {
        if (distanceMeters <= 0) {
            System.out.println("The distance shouldn't be zero or negative!");
            return;
        }

        if (distanceMeters > runningThreshold) {
            System.out.println("Warning: " + displayAnimalType() + "'s run capacity is up to " + runningThreshold + " meters.");
        } else {
            System.out.println(displayAnimalType() + " " + getName() + " ran " + distanceMeters + "m.");
        }
    }

    public String displayAnimalType() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}
