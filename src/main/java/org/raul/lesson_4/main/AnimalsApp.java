package org.raul.lesson_4.main;

import org.raul.lesson_4.model.Cat;
import org.raul.lesson_4.utils.Bowl;

import java.util.Random;

class AnimalsApp {
    public static void main(String[] args) {

        Random generateRandomFeed = new Random();
        Bowl bowl = new Bowl(generateRandomFeed);
        System.out.println(bowl.getFeeding());
        bowl.feedingConsumption(15);


        Cat cat = new Cat("Qizi");
        cat.swim();

        Cat c = new Cat();
        
    }
}
