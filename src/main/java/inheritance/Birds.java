package inheritance;

public class Birds extends Animals{
    public Birds(String type, String food, int noOfLegs, String color) {
        super(type, food, 2 ,color);
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
