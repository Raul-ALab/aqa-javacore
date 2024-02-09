package org.raul.lesson_4.inheritance.main;

import org.raul.lesson_4.inheritance.model.Animal;
import org.raul.lesson_4.inheritance.model.Cat;
import org.raul.lesson_4.inheritance.model.Dog;
import org.raul.lesson_4.inheritance.utils.Plate;

import java.util.Random;

class AnimalsApp {
    public static void main(String[] args) {
        // Setup plate for cats
        int randomBound = 100;
        Random generateRandomFeed = new Random();
        Plate plate = new Plate(generateRandomFeed, randomBound);


        // Setup distance vars for cats and dogs
        int runningDistance = 150;
        int swimmingDistance = 7;
        int hunger = 20;
/*
        // Cats
        Cat catDaisy = new Cat("Daisy", hunger);
        Cat catMilo = new Cat("Milo", hunger);

        catMilo.swim(swimmingDistance);
        catDaisy.run(runningDistance);

        catMilo.eat(plate);
        System.out.println(catMilo.getName() + " is satiate : " + catMilo.isSatiate());

        int extraFeed = 10;
        plate.addFeedToPlate(extraFeed);

        catDaisy.eat(plate);
        System.out.println(catDaisy.getName() + " is satiate : " + catDaisy.isSatiate());
*/
/*
        // Dogs
        Dog dogBlaze = new Dog("Blaze");
        Dog dogTyler = new Dog("Tyler");

        dogBlaze.run(runningDistance);
        dogTyler.swim(swimmingDistance);
*/

        /* 5.4.Создать массив котов и тарелку с едой, попросить всех
        котов покушать из этой тарелки и потом вывести информацию
        о сытости котов в консоль. */
/*
        int arraySize = 5;
        Cat[] cats = new Cat[arraySize];
        String[] catNames = {"Buster", "Chico", "Daisy", "Levi", "Fifi"};

        for (int i = 0; i < cats.length; i++) {
            for (int j = i; j <= i; j++) {
                cats[i] = new Cat(catNames[j], (i + 1) * arraySize); // just to automate hunger values
                System.out.println(cats[i].getName() + " is hunger by " + cats[i].getHunger());
                cats[i].eat(plate);
            }
            System.out.println(cats[i].getName() + " is satiate : " + cats[i].isSatiate());
            System.out.println("==========");
        }
*/
/*
        // Display instance creation count for each class
        System.out.println("Count of cat objects: " + Cat.getInstanceCountCat());
        System.out.println("Count of dog objects: " + Dog.getInstanceCountDog());
        System.out.println("Count of all animal objects: " + Animal.getInstanceCountAnimal());
*/
    }
}
