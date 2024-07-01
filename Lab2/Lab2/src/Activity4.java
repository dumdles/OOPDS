// Write a bubble sort to sort a given array of integers.

// Example: {88, -8, -1, 59, 54, 71, 23}
// Example: {59, -1, 54, 23, -8, 71, 88, 200}


public class Activity4 {
    public static void main(String[] args) {
        int i, j;
        int temp;
        boolean swapped;

        int[] arr1 = {59, -1, 54, 23, -8, 71, 88, 200};

        for (i = 0; i < (arr1.length - 1); i++) {
            swapped = false;

            for (j = 0; j < (arr1.length - i - 1); j++) {

                // Compare adjacent elements, move bigger value to the right if necessary
                if (arr1[j] > (arr1[j + 1])) {
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swap occurs, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Print the sorted array
        for (i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
