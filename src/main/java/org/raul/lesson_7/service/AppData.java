package org.raul.lesson_7.service;

import lombok.Setter;
import org.raul.lesson_7.util.ArrayBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
 * 1. Реализовать сохранение данных в csv файл;
 * 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
 * */
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

    /* Если выполняется save(AppData data), то старые данные
    в файле полностью перезаписываются.*/
    public void save(AppData data) {
        this.header = initHeader();
        this.data = initDataArr();

        /* Строка заголовок с набором столбцов
           (*)Разделитель между столбцами - символ точка с запятой (;) */
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, false))) {
            for (int i = 0; i < header.length; i++) {
                if (i < header.length - 1) {
                    bw.write(header[i] + " " + (i + 1) + getDelimiter());
                } else {
                    bw.write(header[i] + " " + (i + 1));
                }
            }
            bw.newLine();

            /* Набор строк с целочисленными значениями */
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
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
