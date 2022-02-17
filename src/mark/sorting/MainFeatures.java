package mark.sorting;

import java.util.Random;

public class MainFeatures {
    public static void print(int[] array) {
        for (int integer : array) {
            System.out.print(integer + " ");
        }
    }

    public static void createArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
    }
}
