import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        // Prompt user for array size until valid input is given
        while (true) {
            try {
                System.out.println("Enter the size of the array: ");
                size = scanner.nextInt();
                break; // Break the loop, if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input from scanner
            }
        }

        // Declare and create a double array with the size declared by the user
        double[] array = new double[size];

        // Prompt user to enter array elements one by one, with exception handling
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.println("Enter element " + (i + 1) + ": ");
                    array[i] = scanner.nextDouble();
                    break; // Break the loop, if the input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid double.");
                    scanner.next(); // Clear the invalid input from scanner
                }
            }
        }

        // Print array elements using FOR loop
        System.out.println("Average (using for loop): " + avgArrayForLoop(array));
        System.out.println("Average (using while loop): " + avgArrayWhileLoop(array));
        System.out.println("Average (using do-while loop): " + avgArrayDoWhileLoop(array));


        scanner.close();
    }

    // For loop function
    public static double avgArrayForLoop(double[] a) {
        double sum = 0;
        for (double num : a) {
            sum += num;
        }
        return sum / a.length;
    }

    // While loop function
    public static double avgArrayWhileLoop(double[] a) {
        double sum = 0;
        int i = 0;
        while (i < a.length) {
            sum += a[i];
            i++;
        }
        return sum / a.length;
    }

    // Do-while loop function
    public static double avgArrayDoWhileLoop(double[] a) {
        double sum = 0;
        int i = 0;
        do {
            sum += a[i];
            i++;
        } while (i < a.length);
        return sum / a.length;
    }
}
