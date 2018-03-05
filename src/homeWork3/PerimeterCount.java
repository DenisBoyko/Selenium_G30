package homeWork3;

public class PerimeterCount {

    public static void perimeterCounting(int ... valueOfSide) {
        if (valueOfSide.length == 1) {
            int perimeter = valueOfSide[0] * 4;
            System.out.println("square perimeter = " + perimeter);

        } else if (valueOfSide.length == 2) {
            int perimeter = (valueOfSide[0] + valueOfSide[1]) * 2;
            System.out.println("rectangle perimeter = " + perimeter);

        } else if (valueOfSide.length == 3) {
            if (valueOfSide[0] < valueOfSide[1] + valueOfSide[2] && valueOfSide[1] < valueOfSide[0] + valueOfSide[2] && valueOfSide[2] < valueOfSide[0] + valueOfSide[1]) {
                int perimeter = valueOfSide[0] + valueOfSide[1] + valueOfSide[2];
                System.out.println("triangle perimeter = " + perimeter);

            } else {
                System.out.println("triangle can't be built, wrong values of side");
            }
        } else {
            System.out.println("wrong data input");
        }
    }

}




