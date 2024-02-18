package org.raul.lesson_8.service;

import lombok.Getter;
import org.raul.lesson_8.model.Person;
import org.raul.lesson_8.model.Phone;

import java.util.*;

/* 2.Написать простой класс Телефонный Справочник, который хранит
 * в себе список фамилий и телефонных номеров...
 * Желательно не добавлять лишний функционал (дополнительные поля
 * (имя, отчество, адрес), взаимодействие с пользователем через консоль
 * и т.д). Консоль использовать только для вывода результатов проверки
 * телефонного справочника.
 * */
@Getter
public class Phonebook {
    private Map<Phone, Person> contactDetails;

    public Phonebook() {
        this.contactDetails = new HashMap<>();
    }

    /* 2. ...В этот телефонный справочник с помощью метода add()
    можно добавлять записи ...*/
    public void add(String surname, String number) {
        Person person = new Person(surname);
        Phone phone = new Phone(number);

        contactDetails.put(phone, person);
    }

    /*
     * 2. ...а с помощью метода get() искать номер телефона по фамилии.
     * Следует учесть, что под одной фамилией может быть несколько
     * телефонов (в случае однофамильцев), тогда при запросе такой фамилии
     * должны выводиться все телефоны.
     *
     * Рауль: учтены случаи когда вводится несколько букв или также может
     * использоваться номер телефона для поиска конкретных контактных данных.
     * */
    public Map<Phone, Person> get(String searchKeyword) {
        if (getContactDetails().isEmpty()) {
            return null;
        }

        Map<Phone, Person> searchCache = new HashMap<>();

        for (Map.Entry<Phone, Person> entry : contactDetails.entrySet()) {
            String surname = entry.getValue().getSurname();
            String phoneNumber = entry.getKey().getNumber();
            if (surname.contains(searchKeyword) || phoneNumber.contains(searchKeyword)) {
                searchCache.put(entry.getKey(), entry.getValue());
            }
        }
        if (!searchCache.isEmpty()) {
            return searchCache;
        } else {
            return null;
        }
    }
}

