package inheritance;

public interface Mammals extends Animals {

    @Override
    default void eat() {
        System.out.println("Mammals eat meat");
    }
}
