package Java_IO_Streams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

public class ChainingIOStreams {
    public static void main(String[] args) {
        FileInputStream myFile = null;
        BufferedInputStream buff = null;

        try {
            //открываем файл abc.dat при помощи потока ввода FileInputSream
            myFile = new FileInputStream("abc.dat");
            //открываем буфер потока ввода buff (оборачиваем FileInputStream в буффер)
            buff = new BufferedInputStream (myFile);
                boolean eof = false;
                //пока end of file НЕ TRUE, то делаем цикл  (while not end of file)
                while (!eof) {
                    //читаем CHUNK байт (порцию байт) в переменную int byteValue
                    int byteValue = buff.read();
                    System.out.println(byteValue + " ");
                    //если .read выдаёт отрицательное число, значит байт больше нету (конец файла)
                    if (byteValue == -1)
                        eof = true;
                }
        } catch (IOException e) {
            System.out.println(" ");
        } finally {
            if (myFile != null) {
                try {
                    buff.close();
                    myFile.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
