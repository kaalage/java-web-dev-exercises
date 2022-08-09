package exercises.class2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;

        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;

    }

    public static void main(String [] args) {
        int[] arrayList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println();
    }
}
