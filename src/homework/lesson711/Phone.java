package homework.lesson711;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;
    static int count;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model){
        this.number=number;
        this.model=model;
        count++;
    }

    Phone(){
        count++;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number=number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void receiveCall(String name){
        System.out.println("Calling: "+name);
    }

    void receiveCall(String name, String number){
        System.out.println("Имя звонящего: "+name+"\nНомер звонящего: "+number);
    }




    void sendMessage(String message, String... numbers){
        System.out.println(message);
        System.out.println(Arrays.toString(numbers));

    }

    static int getCount(){
        return count;
    }
}
