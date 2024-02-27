package org.raul.lesson_7.main;

import org.raul.lesson_7.service.AppData;

class DriverClass {
    public static void main(String[] args) {

        int header = 3;
        int row = 2;
        int col = 3;
        int[] elements = {100, 200, 123, 300, 400, 500};

        AppData data = new AppData(header, row, col);
        data.setFilePath("src/main/resources/texts/lssn7.csv");
        data.setHeaderTitle("Value");
        data.setDelimiter(';');
        data.setArrElements(elements);

        data.save(data);
        data.readFile();
    }
}
