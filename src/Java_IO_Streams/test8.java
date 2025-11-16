package Java_IO_Streams;

import inheritance.F;

import java.io.*;
import java.util.*;

public class test8 {
    public static void main(String[] args) throws IOException {

//        FileInputStream inputStream = new FileInputStream("D:\\JAVA\\output.txt");
//        InputStreamReader input = new InputStreamReader(inputStream);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JAVA\\output46.txt")));
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        long[] arrBytes = new long[256];

        int size = 65536;

        // Перебираем все байты и загоняем их в коллекцию ЭрейЛист
        int bufferSize = size;
        byte buffer[] = new byte[size];

        long startTime = System.currentTimeMillis();

        while (inputStream.available() > 0) {
            if (inputStream.available() < size) bufferSize = inputStream.available();
            inputStream.read(buffer, 0, bufferSize);
            for (int i = 0; i < bufferSize; i++)
                arrBytes[buffer[i] & 0b11111111]=1;
        }
        long finishTime = System.currentTimeMillis();
        inputStream.close();
        System.out.print("\nвремя работы=" + (finishTime-startTime)+"ms.");
        for (int i = 0; i < arrBytes.length; i++) {
            if (arrBytes[i] == 1) System.out.print(i + " ");
        }


    }
}
