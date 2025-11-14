package Java_IO_Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFromFileInputStream {
    public static void main(String[] args) {
        FileInputStream myFile = null;

        // ЧТЕНИЕ ИЗ ФАЙЛА ПРИ ПОМОЩИ ПОТОКА ВВОДА FileIntputSream
        //создаём класс (поток ввода) FileInputSream и обязательно заворачиваем его в try (малоли файл повреждён или не существует)
        try {
            //открываем файл abc.dat при помощи потока ввода FileInputSream
            myFile = new FileInputStream("abc.dat");

            //делаем флаг eof и присваиваем ему значение false, что бы знать когда прекратить читать (когда нарвёмся на конец файла)
            boolean eof = false;

            //пока end of file НЕ TRUE, то делаем цикл  (while not end of file)
            while (!eof) {

                //читаем один байт в переменную int byteValue
                int byteValue = myFile.read();
                System.out.println(byteValue + " ");

                //если .read выдаёт отрицательное число, значит байт больше нету (конец файла)
                if (byteValue == -1) {
                    //и вот тут если мы нарвались на конец файла, делаем наш флаг true, из-за чего цикл while прерывается
                    eof = true;
                }
            }
            //myFile.close(); // do not do it here!!! (не делать это здесь!!!) т.к. если мы попадём в catch, поток FileInputSream
                                                                // никогда не закроется. т.е. габаредж коллектор может его не почистить

        //ловим try в catch IOException
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.toString());

        //делаем finally (то что здесь написано выполнится при любых ситуациях, даже если выполнение не будет успешным в try блоке)
        } finally {
            //если файл существует
            if (myFile != null){
                try {
                    //здесь мы закрываем файл myFile который открыли (либо через try with resources)
                    myFile.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
