package homework.lesson7;

public class PhoneDemo1 {
    public static void main(String[] args) {
        Phone phone1= new Phone();
        Phone phone2= new Phone();
        Phone phone3= new Phone();

        phone1.model="sd";
        phone2.model="asd";
        phone3.model="sd22";
        phone1.number="d2d2";
        phone2.number="d2d3";
        phone3.number="d2d5";
        phone1.weight=23;
        phone2.weight=23;
        phone3.weight=23;



        System.out.println(phone1.model);
        System.out.println(phone2.model);
        System.out.println(phone3.model);
        System.out.println(phone1.number);
        System.out.println(phone2.number);
        System.out.println(phone3.number);
        System.out.println(phone1.weight);
        System.out.println(phone2.weight);
        System.out.println(phone3.weight);

        phone1.receiveCall("PETRAK");
        System.out.println(phone1.getNumber());
    }
}
