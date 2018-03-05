package homeWork6;

public class Ostrich implements Go, HideHead, Sound{
    @Override
    public void go() {
        System.out.println("I'm Ostrich, I can't fly, but I can go");
    }

    @Override
    public void hideHead() {
        System.out.println("I'm Ostrich , I can hide my head in sand");
    }

    @Override
    public void sound(){
        System.out.println("I'm Ostrich, I say Kyrluk");
    }
}
