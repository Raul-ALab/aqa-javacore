package org.raul.lesson_7.duplicates;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements<T> {
    private List<T> duplicatesList;

    public DuplicateElements() {
        this.duplicatesList = new ArrayList<>();
    }

    public List<T> getDuplicatesList() {
        return duplicatesList;
    }

    public void addElement(T element) {
        duplicatesList.add(element);
    }
}
