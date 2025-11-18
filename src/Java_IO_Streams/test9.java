package Java_IO_Streams;

import java.io.*;

public class test9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String pathFile1 = reader.readLine();
        String pathFile2 = reader.readLine();

        try (FileInputStream file1 = new FileInputStream(pathFile1);
             FileOutputStream file2 = new FileOutputStream(pathFile2)) {

            int[] array = new int[file1.available()];
            int i = 0;

            while (file1.available() > 0) {
                array[i] = file1.read();
                i++;
            }
            for (int j = array.length-1; j >= 0; j--) {
                file2.write(array[j]);
            }


        }


    }
}
