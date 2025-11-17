package homework.lesson_05_09_2025;

public class test {
    public static void main(String[] args) {
        String[] words = new String[]{"abcholoe","black","wonder"};
        for (String word : words) {                                  //перебираем массив Стрингов переданный в наш основной метод
            int[] freq = new int[26];                                               //создаём для каждого слова временный массив
            for (char c : word.toCharArray()) {                                     //toCharArray преобразует Стринг в масив символов
                freq[c-'a']++;
                System.out.print(freq[0]);
                System.out.print(freq[1]);
                System.out.println(freq[2]);//для каждого символа char из массива freq вычисляет индекс char -'a', который соответствует позиции буквы в алфавите
            }
            System.out.println(word);
        }

    }
}
