package mark.sorting.mergeSort;

import mark.sorting.MainFeatures;

class MergeSort {
    static void merge(int[] array, int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] LeftTempArray = new int[n1];
        int[] RightTempArray = new int[n2];

        System.arraycopy(array, left, LeftTempArray, 0, n1);
        System.arraycopy(array, middle + 1, RightTempArray, 0, n2);

        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (LeftTempArray[i] <= RightTempArray[j]) {
                array[left++] = LeftTempArray[i++];
            } else {
                array[left++] = RightTempArray[j++];
            }
        }

        while (i < n1) {
            array[left++] = LeftTempArray[i++];
        }

        while (j < n2) {
            array[left++] = RightTempArray[j++];
        }
    }

    static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        MainFeatures.createArray(array);
        System.out.println("Before: ");
        MainFeatures.print(array);
        System.out.println("\nAfter: ");
        mergeSort(array, 0, array.length - 1);
        MainFeatures.print(array);
    }
}
