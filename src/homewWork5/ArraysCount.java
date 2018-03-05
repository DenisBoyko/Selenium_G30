package homewWork5;

import java.util.Arrays;
import java.util.Random;

public class ArraysCount {

    //Creating of Array with Random numbers

     public static int [] arrayRandomCreating(int lengthOfArray) {
        int[] arrayRandom = new int[lengthOfArray];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = new Random().nextInt(50) - 10;
        }
        return arrayRandom;
    }


    public void arrayFindingMax(int [] inputArray) {
        System.out.println("We use this Array " + Arrays.toString(inputArray));
        int max = 0;
        for (int i : inputArray) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max value in current Array is: " + max);
    }

    public void arraySumOfEven(int [] inputArray) {
        System.out.println("We use this Array " + Arrays.toString(inputArray));
        int sum = 0;
        for (int i : inputArray) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println("Sum of even numbers is: " + sum);
    }


}


