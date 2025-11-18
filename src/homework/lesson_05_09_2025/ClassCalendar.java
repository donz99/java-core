package homework.lesson_05_09_2025;

import inheritance.G;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClassCalendar {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        System.out.println(date.getTime()); // для распечатки используем метод getTime()

        Calendar date2=new GregorianCalendar(2025,9,5);
        Calendar date3=new GregorianCalendar(2025,9,4,13,2,1);
        System.out.println(date2.getTime());  //.getTime() МЕТОД
        System.out.println(date3.getTime());
        Date date555 = new Date(1,2,5);
        System.out.println(date555);


        int month = date2.get(Calendar.MONTH);
        System.out.println(month);
        System.out.println(date2.get(Calendar.ERA));
        System.out.println(date2.get(Calendar.DAY_OF_WEEK));
        System.out.println(date2.get(Calendar.DAY_OF_MONTH));
        System.out.println(date2.get(Calendar.YEAR));
        System.out.println(date2.get(Calendar.HOUR));
        System.out.println(date2.get(Calendar.MINUTE));
        System.out.println(date2.get(Calendar.SECOND));
        date2.set(Calendar.MONTH,2);
        Calendar calendar = new GregorianCalendar(2192,Calendar.JUNE,12);
        System.out.println(calendar.getTime().getTime());
        ZonedDateTime time = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Africa/Cairo"));
        ZonedDateTime newtime = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(time);
        System.out.println(newtime);
        for (String s:ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }

//        System.out.println();




    }

}
