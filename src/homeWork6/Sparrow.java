package homeWork6;

public class Sparrow implements Fly, Go, Sound{
    @Override
    public void go() {
        System.out.println("I'm Sparrow, I can go");
    }

    @Override
    public void fly() {
        System.out.println("I'm Sparrow, I can fly");
    }

    @Override
    public void sound() {
        System.out.println("I'm Sparrow, I say Cheek - Cherik");
    }
}
