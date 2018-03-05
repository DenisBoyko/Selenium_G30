package homeWork2;

public class Bird extends Animal {
    private int birdTail = 5;
    int shoto = 9;

    public Bird(int animalLong, String animalName, String animalColor, int birdTail) {
        super(animalLong, animalName, animalColor);
        this.birdTail = birdTail;
    }

    public void flaying(int amountOfHight){
        System.out.println("I am flaying to " + amountOfHight + " meters" + "My tail " + birdTail + " meters");
    }

    @Override
    public void makeSound(){
        System.out.println("I'm Bird, I say KU KU");

    }



}
