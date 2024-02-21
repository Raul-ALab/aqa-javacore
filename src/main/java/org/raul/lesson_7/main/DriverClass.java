package org.raul.lesson_7.main;

import org.raul.lesson_7.service.AppData;

class DriverClass {
    public static void main(String[] args) {

/*        try (OutputStream out = new BufferedOutputStream(
                new FileOutputStream("src/main/resources/texts/lssn7.csv"))) {
            for (int i = 0; i < 1000; i++) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
/*        try (InputStream in = new BufferedInputStream(
                new FileInputStream("src/main/resources/texts/lssn7.csv"))) {
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        int header = 3;
        int row = 3;
        int col = 3;

        AppData data = new AppData(header, row, col);

        data.setFilePath("src/main/resources/texts/lssn7.csv");
        data.setHeaderTitle("Value");
        data.setDelimiter(';');

        data.save(data);

    }
}
