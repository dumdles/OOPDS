import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Activity4_3 {
    public static void main(String[] args) {
        // ArrayList to store Boat objects
        ArrayList<Boat> boatsList = new ArrayList<>();

        // Create boat objects and add them to the ArrayList boatsList
        Boat b1 = new Boat("50", "WhiteSand", "Sea", "Raffles Marina");
        boatsList.add(b1);

        Boat b2 = new Boat("40", "BlueWave", "Sea", "Marina Bay");
        boatsList.add(b2);

        Boat b3 = new Boat("70", "GreenGrass", "Sea", "Punggol Marina");
        boatsList.add(b3);

        // Access boat objects from the ArrayList
        for (Boat boat : boatsList) {
            setModeOfTravel(boat);
        }
        // Sort the boats by their name
        Collections.sort(boatsList, new BoatNameComparator());

        // Print out the sorted list of Boat objects
        System.out.println("Sorted boat objects by name: ");
        for (Boat boat : boatsList) {
            System.out.println(boat.getName());
        }

    }

    public static void setModeOfTravel(Transportation t) {
        t.move();
    }

}

class Transportation {
    String speed;
    String name;
    String type; // land, sea or air

    public Transportation(String speed, String name, String type) {
        this.speed = speed;
        this.name = name;
        this.type = type;
    }

    void move() {
        System.out.println("Moving in " + type + " at a speed of " + speed);

    }
}

class Boat extends Transportation {
    String basePort;

    Boat(String speed, String name, String type, String basePort) {
        super(speed, name, type);
        this.basePort = basePort;
    }

    void move() {
        super.move();
        System.out.println("The base port for " + name + " is " + basePort + "\n");
    }

    String getName() {
        return name;
    }

}

class BoatNameComparator implements Comparator<Boat> {
    @Override
    public int compare(Boat boat1, Boat boat2) {
        return boat1.getName().compareTo(boat2.getName());
    }
}