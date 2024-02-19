package org.raul.lesson_6.model;

public class MultiDimensional {
    private String[][] array2D;
    private int row;
    private int col;
    private int sum;

    public MultiDimensional() {
    }

    public MultiDimensional(String[][] array2D, int sum) {
        this.array2D = array2D;
        this.sum = sum;
    }

    public String[][] getArray2D() {
        return array2D;
    }

    public void setArray2D(String[][] array2D) {
        this.array2D = array2D;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
