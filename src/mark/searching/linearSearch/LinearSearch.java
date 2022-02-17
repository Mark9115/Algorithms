package mark.searching.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{13, 14, -22, 8, 3, 4, 97, 62, 11, 88};
        int desired = 3;


        System.out.println("The original array:");
        for (int integer : array) {
            System.out.print(integer + " ");
        }

        System.out.println("\nWe want to find the position of element: " + desired);

        if (improvedLinearSearch(array, desired) != -1)
            System.out.println("Position is " + improvedLinearSearch(array, desired));
        else System.out.println("Can't find the element!");
    }

    /**
     * Linear searching - simple bruteforce searching.
     */
    public static int improvedLinearSearch(int[] array, int desired) {
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == desired)
                position = i;
        }

        return position;
    }
}
