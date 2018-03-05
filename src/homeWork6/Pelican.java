package homeWork6;

public class Pelican implements EatFish, Fly, Go, Sound {
    @Override
    public void eatFish() {
        System.out.println("I'm Pelican, I eat fish");
    }

    @Override
    public void fly() {
        System.out.println("I'm Pelican, I can Fly");
    }

    @Override
    public void go() {
        System.out.println("I'm Pelican, I can go");
    }

    @Override
    public void sound(){
        System.out.println("I'm Pelican, I say Bo Bo Bo");
    }
}
