package mark.sorting.cocktailSort;

import mark.sorting.MainFeatures;

public class CocktailSort {
    static void cocktailSort(int[] array) {
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped) {
            swapped = false;
            for (int i = start; i < end - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;

            swapped = false;

            end--;

            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            start++;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        MainFeatures.createArray(array);
        System.out.println("Before: ");
        MainFeatures.print(array);
        System.out.println("\nAfter: ");
        cocktailSort(array);
        MainFeatures.print(array);
    }
}

