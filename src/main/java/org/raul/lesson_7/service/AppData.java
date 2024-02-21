package org.raul.lesson_7.service;

import lombok.Getter;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
        header = new String[2];
    }

    public void initializeHeader(String headerText, char delimiter) {
        for (int i = 0; i < this.header.length; i++) {
            this.header[i] = headerText + delimiter;
        }
    }
    public void save(AppData data) {
        String filePath = "src/main/resources/texts/lssn7.txt";
        initializeHeader("Value", ';');
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))){
            for (int i = 0; i < header.length; i++) {
                bw.write(header[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
