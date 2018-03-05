package interfaces;

public class Bird extends Animal implements Fly {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
