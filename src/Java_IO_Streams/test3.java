package Java_IO_Streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class test3 {
    public static void main(String[] args) throws IOException {
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        FileInputStream inputStream = new FileInputStream(bufferedReader.readLine());

        FileInputStream myFile = new FileInputStream("D:\\JAVA\\test99.txt");


        InputStreamReader inputStreamReader = new InputStreamReader(myFile);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        long startTime = System.currentTimeMillis();
        // Перебираем все байты и загоняем их в коллекцию ЭрейЛист
        ArrayList<Integer> listData = new ArrayList<>();
        while (myFile.available() > 0) listData.add(bufferedReader.read());
        bufferedReader.close();

        // Удаляем дубликаты байтов при помощи HashSet
        ArrayList<Integer> result = new ArrayList<>(new HashSet<>(listData));
        Collections.sort(result);  // Сортираем Эрей лист при помощи метода сорт класса Collections

        // Пока НЕ пусто ArrayList result
        while (!result.isEmpty()) {
            // Выводим последнее значение списка на экран
            System.out.println(result.get(result.size()-1)+" ");
            // Удаляет последний элемент (тот что мы только что вывели) из списка
            result.remove(result.get(result.size()-1));
        }

        long finishTime = System.currentTimeMillis();
        System.out.println("\nвремя работы=" + (finishTime-startTime)+"ms.");


    }
}
