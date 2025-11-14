package Java_IO_Streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingIntoFileOutputStream {
    public static void main(String[] args) {
        //ЗАПИСЬ из файла при помощи ПОТОКА ВЫВОДА FileOutputSream
        int somedata[]= {56,230,123,43,11,37};
        FileOutputStream myFile = null;

        try {
            //открываем поток вывода данных из файла (записи)
            myFile = new FileOutputStream("xyz.dat");
            for (int i = 0; i < somedata.length; i++) {
                //записываем каждый элемемент массива somedata в файл xyz.dat
                myFile.write(somedata[i]);
            }
        } catch (IOException e) {
            //выводим в консоль не удалось записать файл и месседж который мы получили внутри эксепшина
            System.out.println("Could not write to a file: " + e.toString());
        } finally {
            if (myFile!=null){
                try{
                    //опять же через блок файнали закрываем обязательно поток вывода FileOutputStream
                    myFile.close();
                } catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        }


    }
}
