package Java_IO_Streams;

import java.io.*;

public class ReadingCharacterStreams {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        try {
            //ДЛЯ РАБОТЫ С ТЕКСТОВЫМИ ФАЙЛАМИ (если мы знаем что в файле именно текст)
            FileInputStream myFile = new FileInputStream("abc.txt");

            //Указывает что это не просто файл, а ТЕКСТОВЫЙ файл!!!
            InputStreamReader inputStreamReader = new InputStreamReader(myFile, "UTF8");

            Reader reader = new BufferedReader(inputStreamReader);

            int ch;

            //читаем посимвольно (т.к. это текстовый файл)

            while ((ch = reader.read()) > -1) {
                buffer.append((char) ch);
            }
            String result = buffer.toString();
        } catch (IOException e){
            System.out.println(" ");
        } finally {

        }
    }

}
