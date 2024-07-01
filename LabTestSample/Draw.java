import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Draw {
    private int count;
    private ArrayList<String> results;

    // No-argument constructor
    public Draw() {
        this.count = 10;
        this.results = new ArrayList<>();
    }

    // Constructor that accepts an int count to set the count value
    public Draw(int count) {
        this.count = count;
        this.results = new ArrayList<>();
    }

    // Method to randomly generate a single 4-digit String
    public String getSingle4D() {
        Random rand = new Random();
        int num = rand.nextInt(10000); // Generates a number between 0 and 9999
        return String.format("%04d", num); // Formats it as a 4-digit string
    }

    // Method to populate the ArrayList with the required number of 4D strings
    public void generate4DList() {
        for (int i = 0; i < count; i++) {
            results.add(getSingle4D());
        }
    }

    // Method to display the content of the ArrayList
    public void displayList() {
        if (results.size() > 0) {
            System.out.println("1st: " + results.get(0));
        }
        if (results.size() > 1) {
            System.out.println("2nd: " + results.get(1));
        }
        if (results.size() > 2) {
            System.out.println("3rd: " + results.get(2));
        }
        if (results.size() > 3) {
            System.out.println("Others: ");
            for (int i = 3; i < results.size(); i++) {
                System.out.println(results.get(i) + "");
                if ((i - 2) % 5 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of 4D numbers for the draw
        System.out.println("Enter number of 4D for this draw: ");
        int numOf4D = scanner.nextInt();

        // Create a Draw object with the number entered
        Draw draw = new Draw(numOf4D);

        // Generate the 4D numbers list
        draw.generate4DList();

        // Display the results of the draw
        draw.displayList();

        scanner.close();
    }
}
