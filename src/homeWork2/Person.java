package homeWork2;

public class Person {
    private String name = "Vasya";
    private String lastName = "Boiko";
    private int age = 25;
    public Person(){}

    public Person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public void printPersonInformation(){
        System.out.println("Меня зовут " + name + " " + lastName);
        System.out.println("Мне " + age + " лет");
    }
}
