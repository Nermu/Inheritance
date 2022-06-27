package inheritance;

public class Reptiles extends Animals{
    public Reptiles(String type, String food, int noOfLegs, String color) {
        super(type, food, noOfLegs, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void makeSound() {

    }
}
