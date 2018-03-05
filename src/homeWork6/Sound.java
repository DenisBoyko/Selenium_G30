package homeWork6;

public interface Sound {
    default void sound() {
        System.out.println("I'm Bird, I say something");
    }
}
