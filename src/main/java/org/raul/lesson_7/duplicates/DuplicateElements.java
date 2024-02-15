package org.raul.lesson_7.duplicates;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/*
* 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
*
* Рауль: как посоветовал мой проверяющий, я практикую библиотеку Lombok.
 * */

@Getter
public class DuplicateElements<T> {
    private List<T> duplicatesList;

    public DuplicateElements() {
        this.duplicatesList = new ArrayList<>();
    }

    public void addElement(T element) {
        duplicatesList.add(element);
    }
}
