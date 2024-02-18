package org.raul.lesson_8.main;

import org.raul.lesson_8.model.Person;
import org.raul.lesson_8.model.Phone;
import org.raul.lesson_8.service.DuplicateHandler;
import org.raul.lesson_8.service.Phonebook;

import java.util.Map;

class DriverClass {
    public static void main(String[] args) {

        /* 1. Создать массив с набором слов
        (10-20 слов, должны встречаться повторяющиеся).*/
        DuplicateHandler strGenerator = new DuplicateHandler<>();
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
        strGenerator.addElement("Java");

//        strGenerator.printAll();
//        strGenerator.countEachElement();
//        strGenerator.singletonsOnly();
//        strGenerator.retrieveUniqueElements(); // updates the list state


        Phonebook phonebook = new Phonebook();
        phonebook.add("Statham", "+44-0123-3210-00");
        phonebook.add("Boone", "+1-010101-7331-01");
        phonebook.add("Spader", "+1-020202-3540-02");
        phonebook.add("Statham", "+1-030303-4210-04");
        phonebook.add("Hart", "+1-030303-3215-04");
        phonebook.add("Boone", "+44-0134-4310-04");

        for (Map.Entry<Phone, Person> entry : phonebook.getContactDetails().entrySet()) {
            System.out.println(entry.getValue().getSurname() + " " + entry.getKey().getNumber());
        }

        String searchKeyword = "Sta";
        Map<Phone, Person> searchResult = phonebook.get(searchKeyword);

        if (searchResult != null) {
            System.out.println("\nSearch result: ");
            for (Map.Entry<Phone, Person> entry : searchResult.entrySet()) {
                System.out.println(entry.getValue().getSurname() + " : " + entry.getKey().getNumber());
            }
        } else {
            System.out.println("\nNo contact(s) found with '" + searchKeyword + "' keyword!");
        }
    }
}
