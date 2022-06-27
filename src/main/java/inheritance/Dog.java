package inheritance;

public class Dog extends Mammals{
    public Dog(String type, String food, int noOfLegs, String color) {
        super(type, food, noOfLegs, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog Sound");
    }
}
