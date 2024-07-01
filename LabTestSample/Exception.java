public class Exception {
    public static void main(String[] args) {
        try {
            Object x = new Object();
            Integer y = (Integer) x;
        } catch (ClassCastException a) {
            System.out.println("Type error." + a);
        }
    }
}
