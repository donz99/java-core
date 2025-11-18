package homework.Lesson_17_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassDate {
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

        System.out.println(b.getTime());  //внутри объекта Date хранится количество миллисекунд, прошедшее с 1 января 1970 года,
        // Если оно нам нужно, мы можем получить его у объекта Date:

        Date date = new Date();
        date.setTime(111221L);

        Date date2=new Date(2323223L);

        if (date.getTime()<b.getTime()){  //просто сравнить количество миллисекунд, которое в них хранится:
            System.out.println("1sd");
        }

        if (date.before(b)) //если date1 перед date2, то...
            System.out.println("2sdsd");

        if (date2.after(b)) // если date2 после date1, то...
            System.out.println("3s1sdds");

        Date current3 = new Date (105, 5, 4, 12, 15, 0);
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-YYYY");
        String message = formatter.format(current3);
        System.out.println(message);

        Date date5=new Date();
        date5.setTime(Date.parse("Jul 06 12:15:00 2019"));

        Date date6=new Date("Jul 06 12:15:12 2019");

    }
}
