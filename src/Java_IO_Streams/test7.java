package Java_IO_Streams;

import inheritance.F;

import java.io.*;
import java.util.*;

public class test7 {
    public static void main(String[] args) throws IOException {

//        FileInputStream inputStream = new FileInputStream("D:\\JAVA\\output.txt");
//        InputStreamReader input = new InputStreamReader(inputStream);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JAVA\\output46.txt")));
        FileInputStream reader = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        long[] arrBytes = new long[65536];
        long startTime = System.currentTimeMillis();

        // Перебираем все байты и загоняем их в коллекцию ЭрейЛист
        byte fileImage[] = new byte[reader.available()]; //записываем в файл количество байт которые можно сразу же взять
        long fileSize = fileImage.length;
        reader.read(fileImage);
        for (int i = 65535; i >= 0; i--) {
            if (arrBytes[(int) i] > 0) System.out.print(i + " ");

        }
        reader.close();

        // Проходимся по массиву в обратном порядке
        for (int i = 65535; i >= 0; i--)
            // Если такой-то байт был, выводим его на экран
            if (arrBytes[(int) i] > 0) System.out.print(i + " ");


        long finishTime = System.currentTimeMillis();
        System.out.print("\nвремя работы=" + (finishTime-startTime)+"ms.");


    }
}
