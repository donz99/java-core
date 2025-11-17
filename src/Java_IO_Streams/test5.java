package Java_IO_Streams;

import java.io.*;
import java.util.*;

public class test5 {
    public static void main(String[] args) throws IOException {

//        FileInputStream inputStream = new FileInputStream("D:\\JAVA\\output.txt");
//        InputStreamReader input = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JAVA\\output46.txt")));

//        byte[] arrBytes = new byte[256];
        long startTime = System.currentTimeMillis();

        // Перебираем все байты и загоняем их в коллекцию ЭрейЛист
        SortedSet<Integer> listData = new TreeSet<>();
        while (reader.ready()) listData.add(reader.read());
        reader.close();

        // Пока ArrayList НЕ пуст
        while (!listData.isEmpty()) {
            // Выводим последнее значение списка на экран
            System.out.print(listData.last() + " ");
            // Удаляет последний элемент (тот что мы только что вывели) из списка
            listData.remove(listData.last());
        }

        long finishTime = System.currentTimeMillis();
        System.out.print("\nвремя работы=" + (finishTime-startTime)+"ms.");


    }
}
