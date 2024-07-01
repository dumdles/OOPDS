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

class ThreeDPoint extends TwoDPoint {
    private double z;

    // No-arg constructor
    public ThreeDPoint() {
        this.z = 0;
    }

    // Constructor that constructs a 3D point (0, 0, 0)
    public ThreeDPoint(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

//    public double getDistance(ThreeDPoint remotePoint) {
//        double dx = this.getX() - remotePoint.getX();
//        double dy = this.getY() - remotePoint.getY();
//        double dz = this.getZ() - remotePoint.getZ();
//        return Math.sqrt(dx * dx + dy * dy + dz * dz);
//    }

    public double getDistance(ThreeDPoint remotePoint) {
        double xyDistance = super.getDistance(remotePoint);
        double dz = this.getZ() - remotePoint.getZ();
        return Math.sqrt(xyDistance * xyDistance + dz * dz);
    }
}

public class Activity4_1 {
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

        // Test ThreeDPoint functionality
        ThreeDPoint point3D1 = new ThreeDPoint(); // coordinate (0, 0)
        ThreeDPoint point3D2 = new ThreeDPoint(3, 4, 5);

        // Print coordinates of 3D points
        System.out.println("Coordinates of point3D1: (" + point3D1.getX() + ", " + point3D1.getY() + ", " + point3D1.getZ() + ")");
        System.out.println("Coordinates of point3D2: (" + point3D2.getX() + ", " + point3D2.getY() + ", " + point3D2.getZ() + ")");

        // Calculate and print distance between point3D1 and point3D2
        double distance3D = point3D1.getDistance(point3D2);
        System.out.println("Distance between point3D1 and point3D2 (3D): " + distance3D);
    }

}
