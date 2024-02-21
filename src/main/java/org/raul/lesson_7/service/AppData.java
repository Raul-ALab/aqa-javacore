package org.raul.lesson_7.service;

import lombok.Setter;
import org.raul.lesson_7.util.ArrayBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Setter
public class AppData extends ArrayBuilder {
    private String[] header;
    private int[][] data;
    private String filePath;

    public AppData(int headerSize, int row, int col) {
        super(headerSize, row, col);
        header = new String[headerSize];
    }


    public void save(AppData data) {
        header = initHeader(getHeaderSize());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, false))){
            for (int i = 0; i < header.length; i++) {
                if (i < header.length - 1) {
                    bw.write(header[i] + " " + (i + 1) + getDelimiter());
                } else {
                    bw.write(header[i] + " " + (i + 1));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
