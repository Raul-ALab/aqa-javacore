package org.raul.lesson_5.fruitbox;

import java.util.ArrayList;

/* 2.2.Класс Box, в который можно складывать фрукты.
Коробки условно сортируются по типу фрукта, поэтому
в одну коробку нельзя сложить и яблоки, и апельсины.*/
public class Box<T extends Fruit> {
    /* 2.3.Для хранения фруктов внутри коробки
    можно использовать ArrayList.*/
    private ArrayList<T> fruitBox;

    public Box() {
        /*Рауль: Когда мы вызываем этот конструктор,
        он инициализирует новый ArrayList.*/
        this.fruitBox = new ArrayList<>();
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }

    /* 2.7.Не забываем про метод добавления фрукта в коробку.*/
    public void addFruitToBox(T fruit) {
        fruitBox.add(fruit);
    }

    /* 2.4.Сделать метод getWeight(), который высчитывает
    вес коробки, зная вес одного фрукта и их количество.*/
    public float getWeight() {
        float total = 0f;
        for (T box : fruitBox) {
            total += box.getWeight();
        }
        return total;
    }

    /* 2.5.Внутри класса Box сделать метод compare(),
    который позволяет сравнить текущую коробку с той,
    которую подадут в compare() в качестве параметра.
    true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами. */
    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    /* 2.6.Написать метод, который позволяет пересыпать фрукты
    из текущей коробки в другую. Помним про сортировку фруктов:
    нельзя яблоки высыпать в коробку с апельсинами. Соответственно,
    в текущей коробке фруктов не остается, а в другую перекидываются
    объекты, которые были в первой;*/
    public void transferBoxes(Box<T> newBox) {
        for (T oldBox : this.fruitBox) {
            newBox.addFruitToBox(oldBox);
        }
        this.fruitBox.clear();
        System.out.println("Weight of 'Old box' after fruit transfer: " + getFruitBox().size());
        System.out.println("Weight of 'New box' after fruit transfer: " + newBox.getWeight());
    }

}
