package homework.var9;

import java.util.Scanner;

public class var9 {
    public static void main(String[] args) {
        int[] array=new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            if (sc.hasNextInt()){
                array[i]=sc.nextInt();
                if (array[i]<=0){
                    System.out.println("Ввели отрицательное число. Введите новое число: ");
                    i--;
                }
            }
            else {
                if (sc.hasNext()){
                    String buf=sc.nextLine();
                    System.out.println("ОШИБКА: было введено НЕ число. Введите число: ");
                    i--;
                }
            }

        }
        int all=0;
        for (int i = 0; i < array.length; i++) {

            all=all+array[i];

        }
        System.out.println("Общая сумма выплаченых денег: "+all);

        int max= Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println("Максимальная зарплата в фирме равна: "+max);
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min>array[i]){
                min=array[i];
            }
        }
        System.out.println("Минимальная зарплата в фирме равна: "+min);
    }
}
