// Write a binary search program for sorted array of integers.

// Example: {88, -8, -1, 59, 54, 71, 23}
// Example: {59, -1, 54, 23, -8, 71, 88, 200}


import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        int[] arr1 = {-8, -1, 23, 54, 59, 71, 88, 200};
//        int target = 54;

        // Ask the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to search in the array: ");
        int target = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(arr1, target);

        // Print the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }

    // Binary search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search it in the right half
            } else {
                right = mid - 1; // Search it in the left half
            }
        }

        return -1; // Element not found
    }
}
