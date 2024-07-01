import java.util.ArrayList;
import java.util.Arrays;

public class Activity4_5 {
    public static void main(String[] args) {

        // Creating and initialising ArrayList with different elements
        ArrayList<Character> a1 = new ArrayList(Arrays.asList('r', 'P', 't', 'w'));
        System.out.println(getMaximum(a1));

        ArrayList<Float> a2 = new ArrayList(Arrays.asList(111f, -99f, 888f, 333f));
        System.out.println(getMaximum(a2));

        ArrayList<String> a3 = new ArrayList(Arrays.asList("SP", "SG", "EEE", "DCPE"));
        System.out.println(getMaximum(a3)); // Calling getMaximum and printing the result
    }

    // Generic method to find the maximum value of an ArrayList
    public static <E extends Comparable<E>> E getMaximum(ArrayList<E> x) {

        // Initialising max with the first element of the array
        E max = x.get(0);

        // Looping through each element to find the maximum value
        for (int i = 1; i < x.size(); i++) {
            E current = x.get(i);

            // Comparing the current element with the current maximum
            if (current.compareTo(max) > 0) {
                // Updating the maximum if the current element is greater
                max = current;
            }
        }
        return max;
    }
}