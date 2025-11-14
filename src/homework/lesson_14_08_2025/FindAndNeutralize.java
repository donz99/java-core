package homework.lesson_14_08_2025;

import java.util.ArrayList;
import java.util.Iterator;

public class FindAndNeutralize {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        print(copyWordsThird);

//        removeBugWithFor(copyWordsFirst);
//        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);
        print(copyWordsThird);

//        copyWordsFirst.forEach(System.out::println);
//        String line = "_________________________";
//        System.out.println(line);
//        copyWordsSecond.forEach(System.out::println);
//        System.out.println(line);
//        copyWordsThird.forEach(System.out::println);
//        System.out.println(line);
    }

    public static void print(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }

//    public static void removeBugWithFor(ArrayList<String> list) {
//        //напишите тут ваш код
//        for (int i=0;i<list.size();i++){
//            String str="bug";
//            if (str.equals("bug")||str.equals("BUG")||str.equals("Bug")||str.equals("buG")||str.equals("bUg")||str.equals("BUg")||str.equals("bUG")||
//                    str.equals("BuG")){
//                list.remove(i);
//                i--;
//            }
//        }
//    }
    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str=it.next();
            if (str.equals("bug")||str.equals("BUG")||str.equals("Bug")||str.equals("buG")||str.equals("bUg")||str.equals("BUg")||str.equals("bUG")||
                    str.equals("BuG")){
                it.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //напишите тут ваш код

    }
}
