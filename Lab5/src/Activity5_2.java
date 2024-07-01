import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Activity5_2 {
    public static void main(String[] args) {
        String fileName = "b.txt";
        // Call the readTextFile method with the file name
        readTextFile(fileName);

    }

    // Method to read the content of a text file and print it to the console
    public static void readTextFile(String a) {
        String line; // Variable to store each line of the text file
        File myFile = new File(a); // Create a File object with the specified file name
        try {
            // Scanner object to read the file
            Scanner sc = new Scanner(myFile);

            // Read each line in the file until there are no lines
            while (sc.hasNextLine()) {
                line = sc.nextLine(); // Read next line
                System.out.println(line); // Print line to console
            }
            sc.close(); // Close scanner
        } catch (FileNotFoundException e) {
            // Print error message if file is not found
            System.out.println(e.getMessage());
        }

    }

}