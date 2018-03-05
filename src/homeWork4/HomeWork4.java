package homeWork4;

public class HomeWork4 {

    public void transformString(String stringToTransform){
       char [] transformArray = stringToTransform.toCharArray();
        for (char index : transformArray) {
            System.out.println(index);
        }
    }

    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
