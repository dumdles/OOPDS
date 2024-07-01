import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name[] = new String[3];
        int age[] = new int[3];
        String school[] = new String[3];
        int i = 1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name " + i + ": ");
            name[i - 1] = sc.nextLine();

            System.out.println("Enter age " + i + ": ");
            age[i - 1] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter school " + i + ": ");
            school[i - 1] = sc.nextLine();
            i++;
        } while (i <= 3);

        for (int j = 0; j < 3; j++) {
            System.out.println("Student " + (j+1) + ": " + name[j] + ", " + age[j] + ", " + school[j]);
        }

    }
}