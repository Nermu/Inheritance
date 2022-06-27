package inheritance;

public abstract class Mammals extends Animals {

    public Mammals(String type, String food, int noOfLegs, String color) {
        super(type, food, noOfLegs, color);
    }

    @Override
    public void eat() {
        System.out.println("I eat grass or meat");
    }

    @Override
    public void move() {
        System.out.println("Running");
    }
}
