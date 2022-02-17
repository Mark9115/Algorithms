package mark.sorting.insertionSort;

import static mark.sorting.MainFeatures.createArray;
import static mark.sorting.MainFeatures.print;


public class InsertionSort {
    public static void main(String[] args) {
        int[] arrayForInsertionSort = new int[10];

        createArray(arrayForInsertionSort);

        System.out.println("The original array: ");
        print(arrayForInsertionSort);

        System.out.println();
        insertionSort(arrayForInsertionSort);

        System.out.println("The sorted array: ");
        print(arrayForInsertionSort);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}
