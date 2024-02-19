package org.raul.lesson_6.utils;

/* Рауль: Этот класс служит цели обеспечения возможности заполнения
элементов массива строкой и итерации по элементам строки, если длина
строки меньше длины массива.
 * */
public class Conversion {
    public static String stringCharConversion(int arrIndex, String text) {
        char[] chars = text.toCharArray();
        return String.valueOf(chars[arrIndex % chars.length]);
    }
}
