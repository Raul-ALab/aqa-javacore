package org.raul.lesson_4.inheritance.model;

public class Dog extends Animal {
    private static int instanceCountDog = 0;

    public Dog() {
        super(); // superclass default constructor to count instances separately
        instanceCountDog++;
    }

    public Dog(String name) {
        super(name);
        instanceCountDog++; /* Couldn't use this() here because both
        super and this should be first. */
    }

    public static int getInstanceCountDog() {
        return instanceCountDog;
    }

    @Override
    public void run(int distanceMeters) {
        runningThreshold = 500;

        if (distanceMeters <= 0) {
            System.out.println("The distance shouldn't be zero or negative!");
            return;
        }

        if (distanceMeters > runningThreshold) {
            System.out.println("Warning: " + displayAnimalType() + "'s run capacity is up to " + runningThreshold + " distance.");
        } else {
            System.out.println(displayAnimalType() + " " + getName() + " ran " + distanceMeters + "m _ _ _\uD83D\uDC15_");
        }
    }

    @Override
    public void swim(int distanceMeters) {
        swimmingThreshold = 10;

        if (distanceMeters <= 0) {
            System.out.println("The distance shouldn't be zero or negative!");
            return;
        }

        if (distanceMeters > swimmingThreshold) {
            System.out.println("Warning: " + displayAnimalType() + "'s swimming capacity is up to " + swimmingThreshold + " meters.");
        } else {
            System.out.println(displayAnimalType() + " " + getName() + " swam " + distanceMeters + "m ~ ~ ~\uD83D\uDC36~");
        }

    }
}
