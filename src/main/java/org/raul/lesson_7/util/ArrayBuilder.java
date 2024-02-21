package org.raul.lesson_7.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ArrayBuilder {
    private int headerSize;
    private String headerTitle;
    private char delimiter;
    private int arrRow;
    private int arrCol;
    private int[] arrElements;

    public ArrayBuilder(int headerSize, int arrRow, int arrCol) {
        this.headerSize = headerSize;
        this.arrRow = arrRow;
        this.arrCol = arrCol;
    }

    public String[] initHeader(int headerSize) {
        String[] headerArr = new String[headerSize];
        for (int i = 0; i < headerArr.length; i++) {
            headerArr[i] = headerTitle;
        }
        return headerArr;
    }
}
