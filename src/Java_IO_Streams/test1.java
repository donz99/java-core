package Java_IO_Streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {
    public static void main(String[] args) throws IOException {
        // Указываем что это не просто файл, а ТЕКСТОВЫЙ файл!!!
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        // Оборачиваем InputStreamReader в буфер для более быстрой работы
        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String fileName = buffer.readLine(); //Чтение строки с консоли

//        int[] array = new int[255];

        // Открываем файл "fileName" при помощи потока ввода FileInputSream
        try (FileInputStream myFile = new FileInputStream(fileName)) {
            while (myFile.available() > 0) {
                int byteValue = myFile.read();
                System.out.println(byteValue);
//                if (byteValue>maxByte) maxByte=byteValue;
            }
        }
//        System.out.println(maxByte);

    }
}
