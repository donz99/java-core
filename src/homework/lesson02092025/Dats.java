package homework.lesson02092025;

import java.util.Date;

public class Dats {
    public static void main(String[] args) {

        Date current = new Date();
        System.out.println(current);

        Date b = new Date(93,6,1);
        System.out.println(b);

        System.out.println(b.getYear());
        System.out.println(b.getMonth());
        System.out.println(b.getDate());
        System.out.println(b.getDay());
        System.out.println(b.getHours());
        System.out.println(b.getMinutes());
        System.out.println(b.getSeconds());

        b.setYear(95);
        b.setMonth(2);
        b.setDate(2);
        b.setHours(3);
        b.setMinutes(23);
        b.setSeconds(7);


    }
}
