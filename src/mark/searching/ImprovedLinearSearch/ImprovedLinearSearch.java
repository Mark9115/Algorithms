package mark.searching.ImprovedLinearSearch;

public class ImprovedLinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{13, 14, -22, 8, 3, 4, 97, 62, 11, 88};
        int desired = 18;


        System.out.println("The original array:");
        for (int integer : array) {
            System.out.print(integer + " ");
        }

        System.out.println("\nWe want to find the position of element: " + desired);

        if (improvedSearch(array, desired) != -1)
            System.out.println("Position is " + improvedSearch(array, desired));
        else System.out.println("Can't find the element!");
    }

    /**
     * Linear searching - bruteforce searching, starting on both sides.
     */
    public static int improvedSearch(int[] array, int desired) {
        int position = -1;
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            if(array[left] == desired){
                position = left;
                break;
            }
            if(array[right] == desired){
                position = right;
                break;
            }
            right--;
            left++;

        }

        return position;
    }
}
