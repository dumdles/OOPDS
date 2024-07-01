public class Activity4_2 {
    public static void main(String[] args) {
        Rose r = new Rose("Pink", "Damascus", "Majolica", "Happiness");

        // Print the attributes of the Rose object
        System.out.println("Rose color: " + r.color);
        System.out.println("Rose origin: " + r.origin);
        System.out.println("Rose name: " + r.name);
        System.out.println("Rose meaning: " + r.meaning);
    }

}

class Flower {
    String color;
    String origin;

    public Flower(String color, String origin) {
        this.color = color;
        this.origin = origin;
    }
}

class Rose extends Flower {
    String name;
    String meaning;

    public Rose(String color, String origin, String name, String meaning) {
        super(color, origin);
        this.name = name;
        this.meaning = meaning;
    }
}
