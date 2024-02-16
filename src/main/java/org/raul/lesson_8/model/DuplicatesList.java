package org.raul.lesson_8.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

/*
 * 1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся)...
 *
 * Рауль: как посоветовал мой проверяющий, я практикую библиотеку Lombok.
 * */

@Getter
@Setter
public class DuplicatesList<T> {
    private List<T> duplicateElements;

    public DuplicatesList() {
        this.duplicateElements = new ArrayList<>();
    }

    public void addElement(T element) {
        duplicateElements.add(element);
    }

    public void printAll(List<T> list) {
        int i = 0;
        for (T element : list) {
            System.out.println(++i + "." + element);
        }
    }

    /* 1. ...Найти и вывести список уникальных слов,
    из которых состоит массив (дубликаты не считаем).*/
    public void retrieveUniqueElements() {
        removeDuplicates();

        for (T element : getDuplicateElements()) {
            System.out.println(element);
        }
    }

    // Рауль : этот метод специально сделан приватным,
    // чтобы ограничить прямой доступ
    private void removeDuplicates() {
        Set<T> uniqueSet = new HashSet<>();
        for (T element : getDuplicateElements()) {
            uniqueSet.add(element);
        }
        List<T> uniqueList = new ArrayList<>(uniqueSet);
        setDuplicateElements(uniqueList);
    }

    /* 1. ...Посчитать, сколько раз встречается каждое слово.*/
    public void countEachElement() {
        Map<T, Integer> countEach = new HashMap<>();

        for (T element : getDuplicateElements()) {
            countEach.put(element, countEach.getOrDefault(element, 0) + 1);
        }
        for (Map.Entry<T, Integer> entry : countEach.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
        System.out.println("Total count of elements: " + getDuplicateElements().size());
    }
}
