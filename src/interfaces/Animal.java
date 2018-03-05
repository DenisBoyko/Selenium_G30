package interfaces;

public class Animal implements Eat,Breath{

    @Override
    public void eat() {
        System.out.println("Ням Ням");
    }

    @Override
    public void breath() {
        System.out.println("Я дышу");
    }
}
