package Java_IO_Streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(inputStreamReader);

        String fileName = buff.readLine();
        int[] array = new int[255];

        try (FileInputStream readStream = new FileInputStream(fileName)) {
            while (readStream.available() > 0) {
                int byteValue = readStream.read();
                array [byteValue]++;
            }
        }

        int maxCount =0;
        int maxByte = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maxCount) {
                maxCount = array[i];
                maxByte = i;
            }
        }
        System.out.println(maxByte);

    }
}
