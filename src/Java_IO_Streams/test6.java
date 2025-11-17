package Java_IO_Streams;

import java.io.*;
import java.util.*;

public class test6 {
    public static void main(String[] args) throws IOException {

//        FileInputStream inputStream = new FileInputStream("D:\\JAVA\\output.txt");
//        InputStreamReader input = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JAVA\\output46.txt")));

        int[] arrBytes = new int[65536];
        long startTime = System.currentTimeMillis();

        // Изменяем массив и указываем какие байты в нём есть
        while (reader.ready()) arrBytes[reader.read()]++;
        reader.close();

        // Проходимся по массиву в обратном порядке
        for (int i = 65535; i >= 0; i--)
            // Если такой-то байт был, выводим его на экран
            if (arrBytes[(int) i] > 0) System.out.print(i + " ");


        long finishTime = System.currentTimeMillis();
        System.out.print("\nвремя работы=" + (finishTime-startTime)+"ms.");


    }
}
