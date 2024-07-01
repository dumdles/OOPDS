import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int marks;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.print("Enter your marks: ");
            marks = sc.nextInt();

            if (marks >= 0 && marks <= 100) {
                if (marks >= 80) {
                    System.out.println("Grade: A");
                } else if (marks >= 70) {
                    System.out.println("Grade: B");
                } else if (marks >= 60) {
                    System.out.println("Grade: C");
                } else if (marks >= 50) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: F");
                }
            } else if (marks != -1) {
                System.out.println("Invalid mark entered. Marks should be between 0 and 100.");
            }
        } while (marks != -1);
        System.out.println("Ending the program.");
    }
}
