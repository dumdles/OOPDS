import java.util.ArrayList;

public class Activity6_1 {
    public static void main(String[] args) {
        // Empty ArrayList to store String type
        ArrayList<String> a1 = new ArrayList<>();

        // Add names into a1
        a1.add("Sentosa");
        a1.add("Seletar Island");
        a1.add("Sisters' Island");
        a1.add("St. John's Island");
        a1.add("Pulau Ubin");

        System.out.println("Initial a1: " + a1);

        a1.remove(2);
        System.out.println("After removal of 2nd element: " + a1);

        String elementToCheck = "Sisters' Island"; 

        // Check if the element to be removed is not found in a1
        if (a1.contains(elementToCheck)) {
            System.out.println(elementToCheck + " exists in a1.");
        } else {
            System.out.println(elementToCheck + " does not exist in a1.");
        }

        // Clone a1 into a2, and cast the Object to String type
        ArrayList<String> a2 = (ArrayList<String>) a1.clone();

        // Display the contents of a2
        System.out.println("a2: " + a2);

        // Add new element "Pulau Tekong" at index 2 for a2
        a2.add(2, "Pulau Tekong");

        // Create a3 (by cloning a1) and a4 (by cloning a2)
        ArrayList<String> a3 = (ArrayList<String>) a1.clone();
        ArrayList<String> a4 = (ArrayList<String>) a2.clone();

        // Experiment with a3.addAll(a4). Verify the content of a3.
        a3.addAll(a4);
        System.out.println("a3 after a3.addAll(a4): " + a3);

        // Revert the a3 by cloning from a1 again
        a3 = (ArrayList<String>) a1.clone();

        // Experiment with a3.retainAll(a4). Verify the content of a3.
        a3.retainAll(a4);
        System.out.println("a3 after a3.retainAll(a4): " + a3);

        // Revert the a3 by cloning from a1 again
        a3 = (ArrayList<String>) a1.clone();

        // Experiment with a4.removeAll(a3). Verify the content of a4.
        a4.removeAll(a3);
        System.out.println("a4 after a4.removeAll(a3): " + a4);
    }
}
