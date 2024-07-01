// Define an interface for storage devices
interface StorageDevice {
    String getBrand();
    String getCapacity();
}

// SSD class implementing the StorageDevice interface
class SolidStateDrive implements StorageDevice {
    private String brand;
    private String capacity;

    SolidStateDrive(String brand, String capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getCapacity() {
        return capacity;
    }
}

// CPU class
class Processor {
    private String brand;

    Processor(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

// Activity4 class using Dependency Injection
class Activity4DIP {
    private StorageDevice storageDevice;
    private Processor cpu;

    Activity4DIP(StorageDevice storageDevice, Processor cpu) {
        this.storageDevice = storageDevice;
        this.cpu = cpu;
    }

    public String toString() {
        return ("PC with CPU " + cpu.getBrand() + " and SSD " + storageDevice.getBrand());
    }
}

public class Activity4_DIP {
    public static void main(String[] args) {
        // Create objects of StorageDevice (SSD) and CPU
        StorageDevice ssd = new SolidStateDrive("Crucial T705", "2TB");
        Processor cpu = new Processor("Intel");

        // Create an object of Activity4_DIP using Dependency Injection
        Activity4DIP activity4 = new Activity4DIP(ssd, cpu);

        // Output the result of the toString() method
        System.out.println(activity4);
    }
}
