package mark.sorting.selectionSort;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        createArray(array);

        System.out.println("The original array: ");
        print(array);

        System.out.println();
        selectionSort(array);

        System.out.println("The sorted array: ");
        print(array);
    }

    /**
     * The idea of the algorithm: we are looking for the minimum element in the array
     * and swap it with the element in position zero.
     * Next, we are looking for the next largest element and change it with the element with index 1, and so on.
     *
     * @param array - puts current array.
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int position = i;
            int value = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (value > array[j]) {
                    value = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = value;
        }
    }

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
