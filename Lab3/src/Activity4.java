class SSD {
    String brand;
    String capacity;

    SSD(String brand, String capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }
}

class CPU {
    String brand;

    CPU(String brand) {
        this.brand = brand;
    }
}

class pc {
    SSD ssd;
    CPU cpu;

    pc() {
        ssd = new SSD("Crucial T705", "2TB");
        cpu = new CPU("Intel");
    }

    public String toString() {
        return ("PC with CPU " + cpu.brand + " and SSD " + ssd.brand);
    }
}

public class Activity4 {
    public static void main(String[] args) {
        pc pc = new pc();
        System.out.println(pc);
    }
}
