package homework.lesson711;

public class PhoneDemo1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("1", "nokia1",1.2);
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone2.setNumber("2");
        phone3.setNumber("3");

        phone2.setModel("nokia2");
        phone3.setModel("nokia3");

        phone2.setWeight(1.3);
        phone3.setWeight(1.4);

        System.out.println("Номер: " +phone1.getNumber() + "\nМодель: " +phone1.getModel() +
                "\nВес: " +phone1.getWeight());
        System.out.println();
        System.out.println("Номер: " +phone2.getNumber() + "\nМодель: " +phone2.getModel() +
                "\nВес: " +phone2.getWeight());
        System.out.println();
        System.out.println("Номер: " +phone3.getNumber() + "\nМодель: " +phone3.getModel() +
                "\nВес: " +phone3.getWeight());
        phone1.receiveCall("Женя",phone1.getNumber());
        phone1.receiveCall("Pit");

        phone1.sendMessage("0674444","233211");
        phone1.sendMessage("0674444");
        System.out.println(Phone.getCount());



    }




}
