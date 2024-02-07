package org.raul.lesson_4.utils;

import java.util.Random;

public class Bowl {
    private int feeding;


    /* This approach in constructor aims to automate the bowl
    setup with feeding in the hopes that it doesn't go beyond
    the task's scope. */
    public Bowl(Random generateRandomFeed) {
        this.feeding = generateRandomFeed.nextInt(30);
    }

    public int getFeeding() {
        return feeding;
    }

    public void feedingConsumption(int hunger) {
        if (feeding != 0 && (hunger > 0 && hunger <= feeding)) {
            feeding -= hunger;
            System.out.println("Bowl status: " + feeding);
        } else if (hunger > feeding) {
            feeding = 0;
            System.out.println("Bowl status: " + feeding);
        } else {
            System.out.println("Bowl was empty.");
        }
    }
}
