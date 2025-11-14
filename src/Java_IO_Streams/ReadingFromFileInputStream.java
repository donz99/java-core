package Java_IO_Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFromFileInputStream {
    public static void main(String[] args) {
        FileInputStream myFile = null;

        //создаём класс (поток ввода) FileInputSream и обязательно заворачиваем его в try (малоли файл повреждён или не существует)
        try {
            //открываем файл abc.dat при помощи потока ввода FileInputSream
            myFile = new FileInputStream("abc.dat");
            boolean eof = false;

            while (!eof) {
                int byteValue = myFile.read();
                System.out.println(byteValue + " ");
                if (byteValue == -1) {
                    eof = true;
                }
            }
            //myFile.close(); // do not do it here!!!

        //ловим try в catch IOException
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.toString());

        //делаем finally (то что здесь написано выполнится при любых ситуациях, даже если выполнение не будет успешным в try блоке)
        } finally {
            if (myFile != null){
                try {
                    //здесь мы закрываем файл myFile который открыли
                    myFile.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
