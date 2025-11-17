package homework.lesson7;

public class binary {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};





        System.out.println(binarySearch2(array1, 2));
        System.out.println(binarySearch2(array1,12));
    }

    public static int binarySearch2 (int[] array, int item){
        int lowElement = 0;
        int highElement = array.length - 1;

        while (lowElement < highElement) {
            int midElement = (lowElement + highElement) / 2;
            int guessElement = array[midElement];
            if (guessElement == item) {
                return midElement;
            } else if (guessElement > item) {
                highElement = midElement - 1;
            } else {
                lowElement = midElement + 1;
            }
        }
        return Integer.MAX_VALUE;
    }
}
