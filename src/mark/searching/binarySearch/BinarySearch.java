package mark.searching.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{13, 14, -22, 8, 3, 4, 97, 62, 11, 88};
        Arrays.sort(array);

        int desired = 62;

        for (int integer : array) {
            System.out.print(integer + " ");
        }

        System.out.println("\nDesired value: " + desired);

        if(binarySearch(array,desired) != -1)
            System.out.println("Position is: " + binarySearch(array,desired));
        else
            System.out.println("Can't find the element!");
    }

    /**
     * The idea of binary search is to use the information that the array is sorted and
     * reduce the time complexity to O(Log n)
     */
    public static int binarySearch(int[] array, int desired){
        int left = 0;
        int right = array.length - 1;

        while (left <= right){
            int middle = left + (right - left) / 2;

            if (array[middle] == desired)
                return middle;

            if (array[middle] < desired)
                left = middle + 1;
            else if (array[middle] > desired)
                right = middle - 1;
        }

        return -1;
    }

}
