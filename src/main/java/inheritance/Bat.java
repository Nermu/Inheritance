package inheritance;

public class Bat implements Birds,Mammals {

    @Override
    public void eat() {
        System.out.println("Bats eat grass");
    }

    @Override
    public void move() {
        System.out.println("Bats are flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Bat Sound");
    }

    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.move();
        bat.makeSound();
    }


}
