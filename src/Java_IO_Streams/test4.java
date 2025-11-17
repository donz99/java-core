package Java_IO_Streams;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class test4 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("D:\\JAVA\\output46.txt");
        InputStreamReader input = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(input);

        long startTime = System.currentTimeMillis();
        // Перебираем все байты и загоняем их в коллекцию ЭрейЛист
        ArrayList<Integer> listData = new ArrayList<>();
        while (reader.ready()) listData.add(reader.read());
        reader.close();

        // Удаляем дубликаты байтов при помощи HashSet
        ArrayList<Integer> result = new ArrayList<>(new HashSet<>(listData));
        Collections.sort(result);  // Сортираем Эрей лист при помощи метода сорт класса Collections

        // Пока НЕ пусто ArrayList result
        while (!result.isEmpty()) {
            // Выводим последнее значение списка на экран
            System.out.print(result.get(result.size()-1)+" ");
            // Удаляет последний элемент (тот что мы только что вывели) из списка
            result.remove(result.get(result.size()-1));
        }

        long finishTime = System.currentTimeMillis();
        System.out.print("\nвремя работы=" + (finishTime-startTime)+"ms.");


    }
}
