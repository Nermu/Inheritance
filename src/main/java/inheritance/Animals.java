package inheritance;

public abstract class Animals {
    String name;
    String type;
    String food;
    int noOfLegs;
    String color;
    public Animals(String type, String food, int noOfLegs, String color) {
        this.type = type;
        this.food = food;
        this.noOfLegs = noOfLegs;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public String getFood() {
        return food;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public abstract void eat();
    public abstract void move();
    public abstract void makeSound();
}
