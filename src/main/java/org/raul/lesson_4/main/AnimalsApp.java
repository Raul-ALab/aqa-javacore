package org.raul.lesson_4.main;

import org.raul.lesson_4.model.Animal;
import org.raul.lesson_4.model.Cat;
import org.raul.lesson_4.model.Dog;
import org.raul.lesson_4.utils.Bowl;

import java.util.Random;

class AnimalsApp {
    public static void main(String[] args) {

        /* Setup to automate feed generator */
        int randomBound = 100;
        Random generateRandomFeed = new Random();


        Bowl bowl = new Bowl(generateRandomFeed, randomBound);
        System.out.println("Bowl initial status: " + bowl.getFeed());
        bowl.feedConsumption(15);

/*
        // Setup for cat and dog classes
        int runningDistance = 150;
        int swimmingDistance = 10;
*/
/*
        // Cats
        Cat catChina = new Cat();
        Cat catDaisy = new Cat("Daisy");
        Cat catMilo = new Cat("Milo");

        catChina.swim(swimmingDistance);
        catDaisy.run(runningDistance);
*/

/*
        // Dogs
        Dog dogJojo = new Dog("Jojo");
        Dog dogTyler = new Dog("Tyler");

        dogJojo.run(runningDistance);
        dogTyler.swim(swimmingDistance);
*/

/*
        // Display instance creation count for each class
        System.out.println("cat: " + Cat.getInstanceCountCat());
        System.out.println("dog: " + Dog.getInstanceCountDog());
        System.out.println("animal: " + Animal.getInstanceCountAnimal());
*/

    }
}
