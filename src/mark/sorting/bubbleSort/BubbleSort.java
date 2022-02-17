package mark.sorting.bubbleSort;

import static mark.sorting.MainFeatures.createArray;
import static mark.sorting.MainFeatures.print;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arrayForBubbleSort = new int[10];

        createArray(arrayForBubbleSort);

        System.out.println("The original array: ");
        print(arrayForBubbleSort);

        System.out.println();
        bubbleSort(arrayForBubbleSort);

        System.out.println("The sorted array: ");
        print(arrayForBubbleSort);
    }

    /**
     * The idea of the algorithm: we are repeatedly swapping the adjacent elements if they are in wrong order.
     *
     * @param array - puts current array.
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
