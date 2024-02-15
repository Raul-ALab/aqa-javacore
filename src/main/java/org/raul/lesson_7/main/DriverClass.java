package org.raul.lesson_7.main;

import org.raul.lesson_7.duplicates.DuplicateElements;

import java.util.List;

class DriverClass {
    public static void main(String[] args) {
        DuplicateElements strGenerator = new DuplicateElements<>();

        strGenerator.addElement("test");
        strGenerator.addElement("quiz");
        strGenerator.addElement("test");

        List<String> strList = strGenerator.getDuplicatesList();
        for (String word : strList) {
            System.out.println(word);
        }

        DuplicateElements numGenerator = new DuplicateElements<>();
        numGenerator.addElement(1);
        numGenerator.addElement(3);
        numGenerator.addElement(3);

        List<Integer> numList = numGenerator.getDuplicatesList();
        for (Integer nums : numList) {
            System.out.println(nums);
        }
    }
}
