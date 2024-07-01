import java.util.TreeSet;

public class Activity6_5 {
    public static void main(String[] args) {
        // Create a TreeSet, ts1, to store Strings
        TreeSet<String> ts1 = new TreeSet<>();

        // Populate ts1
        ts1.add("netball");
        ts1.add("softball");
        ts1.add("baseball");
        ts1.add("basketball");
        ts1.add("basketball");

        // Verify the content of ts1
        System.out.println(ts1);

        // Create ts2 and populate it
        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("netball");
        ts2.add("softball");
        ts2.add("football");

        // Verify the content of ts2
        System.out.println(ts2);

        // Experiment the TreeSets with clone(), addAll(), retainAll(), removeAll() and
        // clear()
        TreeSet<String> ts3 = new TreeSet<>();
        ts3.addAll(ts1);
        ts3.addAll(ts2);
        System.out.println(ts3);
    }
}
