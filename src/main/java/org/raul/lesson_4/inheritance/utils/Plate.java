package org.raul.lesson_4.inheritance.utils;

import java.util.Random;

public class Plate {
    private int feed;

    public Plate() {
    }

    /* This approach in constructor aims to automate the plate
    setup with feed in the hopes that it doesn't go beyond
    the task's scope. */
    public Plate(Random generateRandomFeed, int randomBound) {
        this.feed = generateRandomFeed.nextInt(randomBound);
    }

    public int getFeed() {
        return feed;
    }

    /* This method sends a message to the console about an empty plate
    if the random number generated is 0. Otherwise, it calculates and
    displays the difference. */
    public void feedConsumption(int hunger) {
        if (feed == 0) {
            System.out.println("This bowl is empty.");
            return; // Don't proceed further
        }
        /* 5.1.Сделать так, чтобы в тарелке с едой не могло
        получиться отрицательного количества еды. */
        if (feed != 0 && (hunger > 0 && hunger <= feed)) {
            feed -= hunger;
            System.out.println("Plate latest status: " + feed);
            /* 5.3.Считаем, что если коту мало еды в тарелке,
            то он её просто не трогает, то есть не может быть
            наполовину сыт.*/
        } else if (feed != 0 && hunger > feed) {
            System.out.println("Cat didn't touch to plate. So, this plate's status is still: " + feed);
        }
    }

    /*  5.5.Добавить в тарелку метод, с помощью которого можно
    было бы добавлять еду в тарелку.*/
    public void addFeedToPlate(int extraFeed) {
        this.feed += extraFeed;
        System.out.println("\nExtra feed added to plate: " + this.feed);
    }
}
