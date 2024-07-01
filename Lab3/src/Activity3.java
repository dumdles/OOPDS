class PrintMachine {
    public static int totalNoOfCopy = 0;

    public String[] copy(String strText, int intNos) {
        String[] copies = new String[intNos];
        for (int i = 0; i < intNos; i++) {
            copies[i] = strText;
            totalNoOfCopy++;
        }
        return copies;
    }
}

public class Activity3 {
    public static void main(String[] args) {
        // Create objects of PrintMachine class
        PrintMachine canon = new PrintMachine();
        PrintMachine fujitsu = new PrintMachine();

        // Copy "Flying!" x6 on the Canon machine
        String[] canonCopies = canon.copy("Flying!", 6);

        // Copy "High!" x8 on the Fujitsu Machine
        String[] fujitsuCopies = fujitsu.copy("High!", 8);

        // Show all the copies' content from the Canon machine
        System.out.println("Copies from the Canon machine:");
        for (String copy : canonCopies) {
            System.out.println(copy);
        }

        // Show all the copies' content from the Fujitsu machine
        System.out.println("Copies from the Fujitsu machine: ");
        for (String copy : fujitsuCopies) {
            System.out.println(copy);
        }

        // Print out the total number of copies generated from the 2 print machines
        int totalCopies = PrintMachine.totalNoOfCopy;
        System.out.println("\nTotal number of copies generated from both machines: " + totalCopies);
    }
}

