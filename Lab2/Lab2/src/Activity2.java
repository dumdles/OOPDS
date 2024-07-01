import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 10000) + 1;

        System.out.println("Original number: " + number);

        // Call the reverse number function, and print the result
        int reversed = reverse(number);
        System.out.println("Reversed number: " + reversed);
    }

    // Method to reverse a number
    public static int reverse(int number) {
        int reversed = 0;

        // Loop until there are no digits left
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Add digit to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from the number
            number /= 10;
        }
        return reversed;
    }
}
