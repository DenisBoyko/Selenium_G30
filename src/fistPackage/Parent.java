package fistPackage;

public class Parent {
    public Parent(int d){
        System.out.println("Parent constructor with parameter");
    }

    public Parent(){
        System.out.println("Parent constructor wittout parameter");
    }

    protected void printClassName(){
        System.out.println("Parent");
    }
}
