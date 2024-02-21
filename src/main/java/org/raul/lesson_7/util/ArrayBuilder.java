package org.raul.lesson_7.util;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter
public abstract class ArrayBuilder {
    private String headerTitle;
    private int[] arrElements;

    @Getter
    private char delimiter;

    @Setter(AccessLevel.NONE)
    private int headerSize;

    @Setter(AccessLevel.NONE)
    private int arrRow;

    @Setter(AccessLevel.NONE)
    private int arrCol;

    public ArrayBuilder(int headerSize, int arrRow, int arrCol) {
        this.headerSize = headerSize;
        this.arrRow = arrRow;
        this.arrCol = arrCol;
        this.arrElements = new int[arrRow * arrCol];
    }

    public String[] initHeader() {
        String[] headerArr = new String[headerSize];
        for (int i = 0; i < headerArr.length; i++) {
            headerArr[i] = headerTitle;
        }
        return headerArr;
    }

    public int[][] initDataArr() {
        int[][] dataArr = new int[arrRow][arrCol];
        int elementIndex = 0;

        for (int i = 0; i < dataArr.length; i++) {
            for (int j = 0; j < dataArr[i].length; j++) {
                dataArr[i][j] = arrElements[elementIndex++];
            }
        }
        return dataArr;
    }
}
