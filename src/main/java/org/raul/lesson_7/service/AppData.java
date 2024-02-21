package org.raul.lesson_7.service;

import lombok.Setter;
import org.raul.lesson_7.util.ArrayBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppData extends ArrayBuilder {
    private String[] header;
    private int[][] data;

    @Setter
    private String filePath;


    public AppData(int headerSize, int row, int col) {
        super(headerSize, row, col);
        this.header = new String[headerSize];
        this.data = new int[row][col];
    }

    public void save(AppData data) {
        header = initHeader();
        this.data = initDataArr();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, false))) {
            for (int i = 0; i < header.length; i++) {
                if (i < header.length - 1) {
                    bw.write(header[i] + " " + (i + 1) + getDelimiter());
                } else {
                    bw.write(header[i] + " " + (i + 1));
                }
            }
            bw.newLine();

            for (int i = 0; i < this.data.length; i++) {
                for (int j = 0; j < this.data[i].length; j++) {
                    if (j < this.data[i].length - 1) {
                        bw.write(Integer.toString(this.data[i][j]) + getDelimiter());
                    } else {
                        bw.write(Integer.toString(this.data[i][j]));
                    }
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
    }
}
