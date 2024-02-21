package org.raul.lesson_7.main;

import org.raul.lesson_7.service.AppData;

class DriverClass {
    public static void main(String[] args) {

/*        try (OutputStream out = new BufferedOutputStream(
                new FileOutputStream("src/main/resources/texts/lssn7.txt"))) {
            for (int i = 0; i < 1000; i++) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
/*        try (InputStream in = new BufferedInputStream(
                new FileInputStream("src/main/resources/texts/lssn7.txt"))) {
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        AppData data = new AppData();
        data.save(data);

    }
}
