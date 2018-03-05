package homeWork2;

public class Fish extends Animal {
    private int startDeep = 0;
    protected int currentDeep;

    public Fish(int animalLong, String animalName, String animalColor) {
        super(animalLong, animalName, animalColor);
    }

    public void fishDipping(int amountOfDeep){
        currentDeep = amountOfDeep;
        System.out.println("I am deeping to " + currentDeep + " meters");
    }

    @Override
    public void makeSound(){
        System.out.println("I'm Fish, I say nothing");
    }





}
