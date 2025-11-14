package homework.lesson28072025;

public class Recursion {
    static int factorial (int n){
        int result;

        if (n<2){
            return 1;
        }
        result=factorial(n-1)*n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Факториал 3: "+factorial(3));
    }
}
