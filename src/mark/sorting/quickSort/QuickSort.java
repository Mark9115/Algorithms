package mark.sorting.quickSort;

import mark.sorting.MainFeatures;

public class QuickSort {

    public static void quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int swapTemp = array[i];
        array[i] = array[j];
        array[j] = swapTemp;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        MainFeatures.createArray(array);
        System.out.println("Before: ");
        MainFeatures.print(array);
        System.out.println("\nAfter: ");
        quickSort(array, 0, array.length - 1);
        MainFeatures.print(array);
    }
}
