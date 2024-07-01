class TwoDPoint {
    private double x;
    private double y;

    // No-argument constructor
    public TwoDPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with specific coordinates
    public TwoDPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter method for x coordinate
    public double getX() {
        return x;
    }

    // Getter method for y coordinate
    public double getY() {
        return y;
    }

    // Method to calculate distance between two points
    public double getDistance(TwoDPoint remotePoint) {
        double dx = this.x - remotePoint.getX();
        double dy = this.y - remotePoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class Activity2 {
    public static void main(String[] args) {
        // Create two points
        TwoDPoint point1 = new TwoDPoint(); // Constructs a point (0,0)
        TwoDPoint point2 = new TwoDPoint(3, 4); // Constructs a point (3,4)

        // Print coordinates of point1
        System.out.println("Coordinates of point1: (" + point1.getX() + ", " + point1.getY() + ")");

        // Print coordinates of point2
        System.out.println("Coordinates of point2: (" + point2.getX() + ", " + point2.getY() + ")");

        // Calculate and print distance between point1 and point2
        double distance = point1.getDistance(point2);
        System.out.println("Distance between point1 and point2: " + distance);

    }

}
