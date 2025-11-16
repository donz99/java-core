package Java_IO_Streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class CreatesTxtFile {
    public static void main(String[] args) {
        String directoryPath = "D:\\JAVA";  // Заданная директория
        String fileName = "output46.txt";     // Имя создаваемого файла
        long fileSize = 1024 * 46024;               // Размер файла в байтах

        File dir = new File(directoryPath);
        if (!dir.exists()) dir.mkdirs();    // Проверяет существует ли директория Создаём директорию, если не существует

        File file = new File(dir, fileName);

        try (FileOutputStream fos = new FileOutputStream(file)){  // Последовательно записывает в файл байты
            byte[] buffer = new byte[4096]; // Создаём буфер из 4096 байт
            long bytesWritten = 0;          // Счётчик записанных байт
            Random random = new Random();   // Генератор случайных чисел

            while (bytesWritten < fileSize) {
                random.nextBytes(buffer);   // Заполняем буфер случайными байтами
                int bytesToWrite = (int)Math.min(buffer.length, fileSize - bytesWritten); // Определяем сколько байт писать в данном цикле (не привысить нужный размер)
                fos.write(buffer, 0, bytesToWrite); // Записываем часть буфера в файл
                bytesWritten += bytesToWrite;   // Обновляем счетчик записанных байт
            }
            System.out.println("Файл создан: " + file.getAbsolutePath() + " | Размер: " + bytesWritten + " байт");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
