package org.raul.lesson_8.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

/*
 * 1.Создать массив с набором слов (10-20 слов, должны встречаться
 * повторяющиеся)...
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

    public void printAll() {
        int i = 0;
        for (T element : getDuplicateElements()) {
            System.out.println(++i + "." + element);
        }
    }

    /*
     * 1. ...(а)Найти и вывести список уникальных слов, из которых состоит
     * массив (дубликаты не считаем).
     *
     * Рауль: я не был уверен нужно ли удалять дубликаты, чтобы сделать элементы
     * уникальными или искать и выбирать только неповторяющиеся элементы без
     * удаления дубликатов. Так как было выходное время, и я не хотел беспокоить,
     * и решил создать обе версии для этой конкретной задачи.
     * */
    public void singletonsOnly() {
        Map<T, Integer> countedList = countEachElementReturn();

        /* Рауль: поскольку метод 'remove' из класса Map удаляет на основе keys,
        мне пришлось использовать Iterator для удаления элементов на основе values.*/
        Iterator<Map.Entry<T, Integer>> iter = countedList.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<T, Integer> entry = iter.next();
            if (entry.getValue() > 1) {
                iter.remove();
            }
        }
        System.out.println("\nDisplay singleton elements only: ");
        for (Map.Entry<T, Integer> entry : countedList.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }

    /*
     * 1. ...(б)Найти и вывести список уникальных слов, из которых состоит
     * массив (дубликаты не считаем).
     *
     * Рауль: в этом методе я сначала удаляю дубликаты, чтобы каждый элемент
     * стал уникальным.
     * */
    public void retrieveUniqueElements() {
        removeDuplicates();

        System.out.println("Remove duplicates and display: ");
        for (T element : getDuplicateElements()) {
            System.out.println(element);
        }
    }

    /* Рауль: этот метод специально сделан приватным, чтобы сделать
    его доступным только для использования внутри класса.*/
    private void removeDuplicates() {
        Set<T> uniqueSet = new HashSet<>();
        for (T element : getDuplicateElements()) {
            uniqueSet.add(element);
        }
        List<T> uniqueList = new ArrayList<>(uniqueSet);
        setDuplicateElements(uniqueList);
    }

    /* 1. ... Посчитать, сколько раз встречается каждое слово.*/
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

    /* Рауль: этот метод специально сделан приватным, чтобы сделать
    его доступным только для использования внутри класса.*/
    private Map<T, Integer> countEachElementReturn() {
        Map<T, Integer> countEach = new HashMap<>();

        for (T element : getDuplicateElements()) {
            countEach.put(element, countEach.getOrDefault(element, 0) + 1);
        }
        return countEach;
    }
}
