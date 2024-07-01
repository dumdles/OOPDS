public class Q1 {
    public static void main(String[] args) {
        try {
            Object x = new Object();
            Integer y = (Integer) x;
        } catch (ClassCastException e) {
            System.out.println("Error: " + e);
        }
    }
}
