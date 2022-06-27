package inheritance;

public abstract class FishS extends Animals{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FishS(String type, String food, int noOfLegs, String color, String name) {
        super(type, food, noOfLegs, color);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("I eat seaFood");
    }

    @Override
    public void move() {
        System.out.println("Swimming");
    }
}
