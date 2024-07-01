import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int nonZeroCount = 0;
        int input;

        System.out.println("Enter your integers (enter 0 to finish):");

        // Read integers until -1 is entered
        while ((input = sc.nextInt()) != 0) {
            // Check if the input integer is non-zero
            if (input != 0) {
                total += input;
                nonZeroCount++;
            }
        }

        // Calculate the average
        double average = nonZeroCount > 0 ? (double) total / nonZeroCount : 0;

        // Display the total and average
        System.out.println("Total of non-zero integers: " + total);
        System.out.println("Average of non-zero integers: " + average);

        sc.close();
    }
}