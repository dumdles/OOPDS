public class Activity1 {
    public static void main(String[] args) {
        System.out.println("Degree | Sin | Cos");
        System.out.println("-------------------");

        // Print out values from 0 to 360 in increments of 10
        for (int degree = 0; degree <= 360; degree += 10)
        {
            // Calculate the respective sin and cos values
            double radians = Math.toRadians(degree);
            double sinValue = Math.sin(radians);
            double cosValue = Math.cos(radians);

            // Print out the values in a table format
            System.out.printf("%d\t%.4f\t%.4f\n", degree, sinValue, cosValue);
        }
    }
}
