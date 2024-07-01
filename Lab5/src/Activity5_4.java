import java.util.HashMap;
import java.util.Scanner;

public class Activity5_4 {
    public static void main(String[] args) {
        // Create a HashMap to store VendingMachine objects with Integer keys
        HashMap<Integer, VendingMachine> vmGroup = new HashMap<>();

        // Put the 1st vending machine into the HashMap with key 1
        vmGroup.put(1, new CoinVendingMachine());
        vmGroup.put(2, new CoinNoteVendingMachine());

        // Iterate over the HashMap using keys from 1 to the size of the HashMap
        for (int i = 1; i <= vmGroup.size(); i++) {
            // Call the printInstruction method to print the instructions for each vending
            // machine
            vmGroup.get(i).printGuide();
        }
    }
}

// Interface
interface VendingMachine {
    public void printGuide();
}

class CoinVendingMachine implements VendingMachine {

    public void printGuide() {
        System.out.println("This machine accepts coins only.");
        System.out.println("Drop in coins.");
        System.out.println("Select item.");
        System.out.println("Press GO button.");
    }
}

class CoinNoteVendingMachine implements VendingMachine {
    public void printGuide() {
        System.out.println("This machine accepts coins and notes.");
        System.out.println("Drop in coins and insert notes.");
        System.out.println("Select item.");
        System.out.println("Press GO button.");
    }
}
