public abstract class HousePet {
    protected String name, favouriteFood, owner;

    public HousePet() {
        name = "Pooky";
        owner = "Donna";
        favouriteFood = "cookies";
    }

    // Overloaded instructor
    public HousePet(String n, String o, String ff) {
        this.name = n;
        this.owner = o;
        this.favouriteFood = ff;
    }

    // These abstract methods must be overriden in the subclasses
    public abstract String where_I_Sleep();

    public abstract String how_I_Move();

    public void setName(String n) {
        this.name = n;
    }

    public void setFavoriteFood(String ff) {
        this.favouriteFood = ff;
    }

    public void setOwner(String o) {
        this.owner = o;
    }

    public String toString() {

        String output = "I am " + name + " a house pet. "
                + "\nMy favorite food is " + favouriteFood
                + ".\nMy owner is " + owner + ".";
        return output;

    }
}

class Dog extends HousePet {
    protected int numberOfWalksPerDay;

    public Dog() {
        // This calls HousePet() automatically
        super();
        numberOfWalksPerDay = 2;
    }

    public Dog(String n, String o, String ff, int numWalks) {
        // We must explicitly call the HousePet() overloaded
        // constructor, passing it the name, and food info
        super(n, o, ff);
        this.numberOfWalksPerDay = numWalks;
    }

    /*
     * Here are the two methods that are abstract in the superclass, which
     * are overriden here, thus making Dog a complete class
     */

    public String where_I_Sleep() {
        return "I sleep in my owner's bed";
    }

    public String how_I_Move() {
        return "I walk on all fours";
    }

    public String toString() {
        String output = super.toString();
        System.out.println(output);
        return output;
    }
}

// Main class to test the code
 class TestHousePet {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "John", "bones", 3);
        System.out.println(dog.toString());
    }
}
