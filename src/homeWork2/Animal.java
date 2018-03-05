package homeWork2;

public class Animal {
    int animalLong;
     String animalName;
    String animalColor;


    public Animal(int animalLong, String animalName, String animalColor){
        this.animalLong = animalLong;
        this.animalName = animalName;
        this.animalColor = animalColor;
    }

    public void makeSound(){
        System.out.println("I say something");

    }
}
