//package homework.lesson_05_09_2025;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Solution {
//    public static void main(String[] args) {
//        String[] str1 = new String[]{"Sell","Done","well"};
//        List<String> listStrings = commonChars(str1);
//        for (String s : listStrings){
//            System.out.println(s);
//        }
//    }
//
//
//    public static List<String> commonChars(String[] words) {
//        int[] minFreq = new int[26];                            //создаём массив для хранения минимальной частоты КАЖДОЙ буквы
//        Arrays.fill(minFreq, Integer.MAX_VALUE);                //заполняет весь массив minFreq значением MAX_VALUE
//
//        for (String word: words) {                                  //перебираем массив Стрингов переданный в наш основной метод
//            int[] freq = new int[26];                                               //создаём для каждого слова временный массив
//            for (char c : word.toCharArray()) {                                     //toCharArray преобразует Стринг в масив символов
//                freq[c- 'a']++;
//                System.out.println(freq[0]);//для каждого символа char из массива freq вычисляет индекс char -'a', который соответствует позиции буквы в алфавите
//                                                                //и увеличивает значение в массиве freq по этому индексу на 0
//            }
////            for (int i = 0; i < 26; i++) {
////                minFreq[i] = Math.min(minFreq[i], freq[i]);  //возвращает минимальное из двух чисел
////            }
//        }
////        List <String> result = new ArrayList<>();
////        for (int i = 0; i < 26; i++) {
////            for (int j = 0; j < minFreq[i]; j++) {
////                result.add (Character.toString((char) ('a' + i)));
////            }
////        }
//    }
//}
