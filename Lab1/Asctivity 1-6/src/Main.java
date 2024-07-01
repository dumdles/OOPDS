import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of (long) text: ");
        String text = sc.nextLine();

        int x = text.indexOf("Apollo 13");
        if (x != -1) {
            System.out.println("Apollo 13 is found at: " + x);
            System.out.print("Apollo 13 was found ");

            do {
                System.out.print(x + " ");
                x = text.indexOf("Apollo 13", x+1);
            } while (x != -1);
        }
        else {
            System.out.print("Apollo 13 was not found!");
        }
    }
}