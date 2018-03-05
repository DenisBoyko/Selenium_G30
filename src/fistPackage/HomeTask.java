package fistPackage;

public class HomeTask {
    public void sumOfTwoNumbers(int a, int b){
        System.out.println(a + b);
    }
    public void sqrtOfNumber(int a, int b){
        int max;
        if (a > b){
            max = a;
        } else {
            max = b;
        }

        double sqrt = Math.sqrt(max);
        System.out.println("Большое число из " + a + " и " + b + " равно " + max);
        System.out.println("Квадратный корень из " + max + " равен " + sqrt );
    }


}
