package inheritance;

public interface Birds extends Animals {
    @Override
    default void eat(){
        System.out.println("Birds eat insects");
    }
}
