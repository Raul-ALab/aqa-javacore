package org.raul.lesson_4.model;

public class Cat extends Animal {
    private static int instanceCountCat = 0;
    private int hunger;

    public Cat() {
        super(); // superclass default constructor to count instances separately
        instanceCountCat++;
    }

    public Cat(String name) {
        super(name);
        instanceCountCat++; /* Couldn't use this() here because both
        super and this should be first. */
    }

    public static int getInstanceCountCat() {
        return instanceCountCat;
    }

    @Override
    public void run(int distanceMeters) {
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
        swimmingThreshold = 0;
        System.out.println("I am a " + displayAnimalType() + "\uD83D\uDC31 and I hate swimming.");
    }

/*    public void eat(Bowl bowl) {
        bowl.feedConsumption(hunger);
    }*/
}
