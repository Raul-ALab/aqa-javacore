package org.raul.lesson_6.my_exceptions;

/* Рауль: Причина по которой я расширил это исключение от NumberFormatException,
а не от основных суперклассов, заключается в том что я хотел предоставить
точную и удобную базу для обработки ошибок связанных с разбором чисел.*/
public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(String message) {
        super(message);
    }
}
