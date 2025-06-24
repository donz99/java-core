package homework.lesson11;

import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {
//        Double double1= new Double(12.5); //приведение дабла к объекту типа Double
//        Double double2= new Double("13.2"); // приведетение стринга к объекту типа Double
//        Double double3= Double.valueOf(13.2); // приведение дабла к объекту типа Double
//        Double double4= Double.valueOf("13.523"); // приведетение стринга к объекту типа Double
//        double double5=Double.parseDouble("21.23"); // .parseDouble -приведение Стринга к примитиву дабл
//        String s1=Double.toString(3.12);  // .toString - приведение дабл к трингу
//        String s2=Long.toBinaryString(254); // .toBinaryString - приведение к двоичной системе исчесления
//        Integer iOb=new Integer(1000); // создание объекта iOb со значением 1000
//        System.out.println(iOb.byteValue()); //Пример приведения Объекта к типу Байт
//        int x52=Integer.MIN_VALUE;// статическая константа
//        System.out.println(2+1);

//        Scanner sc = new Scanner(System.in);
//        if (((sc.nextInt())&1)==0)
//            System.out.println("Число чётное");
//        else System.out.println("Число НЕчётное");

//        Scanner sc = new Scanner(System.in);
//        int x1=sc.nextInt();
//        int x12=x1<0?-x1:x1;
//        int x2=sc.nextInt();
//        int x22=x2<0?-x2:x2;
//        int x3=sc.nextInt();
//        int x32=x3<0?-x3:x3;
//        if ((x12<x22)&&(x12<x32))
//            System.out.println("Меньшее число по модулю "+x12);
//        else if ((x12<x22)&&(x12>x32))
//            System.out.println("Меньшее число по модулю "+x32);
//        else System.out.println("Меньшее число по модулю "+x22);

        int g=78;
        System.out.println(Integer.toBinaryString(g));
        blink(g);
        beg(g,1);
        bbb(g);
        ppp(g);


    }
    static void blink (int g){
        g=~g;
        System.out.println(Integer.toBinaryString(g));
    }
    static void beg (int g,int x){
        g=g>>x;
        System.out.println(Integer.toBinaryString(g));
    }
    static void bbb (int g){
        int x=1;
        int z=g&x;
        if (z==1)
            System.out.println("Лампочка 1-ой позиции включена");
        else
            System.out.println("Лампочка 1-ой позиции выключена");
    }
    static void ppp(int g){
        int z=g;
        int mask=15;
        int coded=g;
        System.out.println(Integer.toBinaryString(z));
    }




}
