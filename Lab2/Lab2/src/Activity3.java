public class Activity3 {
    public static void main(String[] args) {
        String[] a = {"aaa", "qqq", "AAA", "QQQ"};

        int i, j;
        String temp;
        boolean swapped;
        for (i = 0; i < (a.length - 1); i++) {
            swapped = false;
            for (j = 0; j < (a.length - i - 1); j++) {
                // compare adjacent elements, swap if necessary
                if (a[j].compareTo(a[j + 1]) > 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swap occurs, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Print the sorted array
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}