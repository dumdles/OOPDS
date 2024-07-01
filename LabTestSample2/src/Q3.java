import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of 4D for this draw: ");
        int drawInput = sc.nextInt();
        sc.nextLine();
    }
}

class Draw {
    private int count;
    private ArrayList<String> results;

    public Draw() {
        this.count = 0;
        this.results = new ArrayList<>();
    }

    public Draw(int count) {
        this.count = count;
        this.results = new ArrayList<>();
    }

    public String getSingle4D() {
        Random rand = new Random();
        int num = rand.nextInt(10000);
        return String.format("%04d", num);
    }

    public void generate4DList() {
        for (int i = 0; i < count; i++) {
            results.add(getSingle4D());
        }
    }

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
                System.out.println(results.get(i));
            }
        }
    }

}
