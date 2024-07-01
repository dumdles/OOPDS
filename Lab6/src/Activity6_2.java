import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Activity6_2 {
    public static void main(String[] args) {
        // Create an ArrayList, called a1, from a string array a using Arrays, asList()
        String a[] = {"Raffles Marina", "Bedok", "Sultan Shoal", "Fort Canning"};
        ArrayList<String> a1 = new ArrayList<>(Arrays.asList(a));
        
        // Create a LinkedLIst, called LL1, from array a1 using
        LinkedList<Object> LL1 = new LinkedList<Object>(a1);
        System.out.println("Initial LL1: " + LL1);

        // Use removeFirst() to remove the first element from LL1
        LL1.removeFirst();
        System.out.println("LL1 after removeFirst(): " + LL1);

        // Use addFirst() to add an integer 111 to the hed of LL1
        LL1.addFirst(111);
        System.out.println("LL1 after addFirst(111): " + LL1);

        // Use removeLast() to remove the last element from LL1
        LL1.removeLast();
        System.out.println("LL1 after removeLast(): " + LL1);

        // Use addLast() to add an integer 888 to the tail of LL1
        LL1.addLast(888);
        System.out.println("LL1 after addLast(): " + LL1);

        // Use ListIterator to display the LL1 forward
        LL1.listIterator(0);
        ListIterator<Object> li = LL1.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
