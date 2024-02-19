package org.raul.lesson_5.main;


import org.raul.lesson_5.fruitbox.Apple;
import org.raul.lesson_5.fruitbox.Box;
import org.raul.lesson_5.fruitbox.Orange;

class DriverClass {
    public static void main(String[] args) {

/*
        // Driver for 'generics' package
        Integer[] numArr = {5, 4, 2, 7};
        SwapGenericsArr.swapElements(numArr, 0, 2);

        String[] strArr = {"Dog", "Hamster", "Cat"};
        SwapGenericsArr.swapElements(strArr, 1, 2);

        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(strArr));
*/

        // Driver for 'fruitbox' package

        // First apple box
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruitToBox(new Apple(0.5f));
        appleBox.addFruitToBox(new Apple(1.0f));
        appleBox.addFruitToBox(new Apple(0.2f));
        System.out.println(("Total weight of 1st Apple box is: " + appleBox.getWeight()
                + ", and count in the box is " + appleBox.getFruitBox().size()));

        // Orange box
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruitToBox(new Orange(1.0f));
        orangeBox.addFruitToBox(new Orange(0.2f));
        orangeBox.addFruitToBox(new Orange(0.4f));
        orangeBox.addFruitToBox(new Orange(0.1f));
        System.out.println(("Total weight of Orange is: " + orangeBox.getWeight()
                + ", and count in the box is " + orangeBox.getFruitBox().size()));

        // Second apple box
        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruitToBox(new Apple(0.4f));
        appleBox2.addFruitToBox(new Apple(1.1f));
        appleBox2.addFruitToBox(new Apple(0.35f));
        appleBox2.addFruitToBox(new Apple(0.22f));
        System.out.println(("Total weight of 2nd Apple box is: " + appleBox2.getWeight()
                + ", and count in the box is " + appleBox2.getFruitBox().size()));

        // Compare weights of the boxes regardless of fruit types.
        System.out.println("is apple box weight equal to orange box: "
                + appleBox.compare(orangeBox));

        // Transfer apples from one box to another
        appleBox.transferBoxes(appleBox2);


/*
        for (Apple apple : appleBox.getFruitBox()) {
            System.out.println(apple.getWeight());
        }
*/
    }
}
