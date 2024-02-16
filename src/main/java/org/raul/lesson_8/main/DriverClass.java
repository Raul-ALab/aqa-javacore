package org.raul.lesson_8.main;

import org.raul.lesson_8.model.DuplicatesList;

import java.util.List;

class DriverClass {
    public static void main(String[] args) {
        DuplicatesList strGenerator = new DuplicatesList<>();

        /* 1.	Создать массив с набором слов
        (10-20 слов, должны встречаться повторяющиеся).*/
        strGenerator.addElement("Java");
        strGenerator.addElement("C++");
        strGenerator.addElement("Java");
        strGenerator.addElement("GO");
        strGenerator.addElement("Kotlin");
        strGenerator.addElement("GO");
        strGenerator.addElement("Java");
        strGenerator.addElement("GO");
        strGenerator.addElement("Kotlin");
        strGenerator.addElement("Python");
        strGenerator.addElement("PHP");
        strGenerator.addElement("GO");
        strGenerator.addElement("JavaScript");
        strGenerator.addElement("Java");
        strGenerator.addElement("Python");
        strGenerator.addElement("Kotlin");
        strGenerator.addElement("C++");

        List<String> strList = strGenerator.getDuplicateElements();
        strGenerator.printAll(strList);
        strGenerator.countEachElement();
        strGenerator.retrieveUniqueElements();


    }
}
