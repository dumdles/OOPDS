import java.util.Random;

class Die {
    private int maxFace;

    // Constructor to set maxFace
    public Die(int maxFace) {
        this.maxFace = maxFace;
    }

    // Method to roll the die and return a random number
    public int roll() {
        Random rand = new Random();
        return rand.nextInt(maxFace) + 1;
    }
}