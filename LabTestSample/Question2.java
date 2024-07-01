public class Question2 {
    public static void main(String[] args) {
        Transportation lrt = new LRT(80);
        lrt.Move();
    }
}

interface Transportation {
    public void Move();
}

class LandTransport implements Transportation {
    double speed;

    LandTransport(double speed) {
        this.speed = speed;
    }

    @Override
    public void Move() {
        System.out.println("Moving on land");
    }
}

class LRT extends LandTransport {
    LRT(double speed) {
        super(speed);
    }

    @Override
    public void Move() {
        System.out.println("Moving on rail tracks");
    }
}
