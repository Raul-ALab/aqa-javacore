package org.raul.lesson_6.my_exceptions;

/* Рауль: Исходя из ответственности пользователя за предоставление
размера массива при вызове метода, а также учитывая, что
любая ошибка в предоставлении правильного размера массива
скорее всего, будет вызвана ошибкой программирования или
неправильным использованием метода, и учитывая, что исключения
связанные с массивами обычно группируются как непроверяемые
исключения, я решил сделать исключение непроверяемым,
наследуя RuntimeException.*/
public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super(message);
    }
}
