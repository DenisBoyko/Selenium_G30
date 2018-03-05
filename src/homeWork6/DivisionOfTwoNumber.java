package homeWork6;

public class DivisionOfTwoNumber {


    public boolean numbersValidation(int checkNumber1, int checkNumber2) {
        boolean flag = false;
        if (checkNumber1 > 1000 || checkNumber2 > 1000) {
            throw new IllegalArgumentException("Fist or Second number bigger than 1000:"
                    + " Fist number: " + checkNumber1 + " Second number: " + checkNumber2);

        } else if (checkNumber1 < -1000 || checkNumber2 < -1000) {
            throw new IllegalArgumentException("Fist or Second number less than -1000:"
                    + " Fist number: " + checkNumber1 + " Second number: " + checkNumber2);
        } else {
            flag = true;
        }
        return flag;
    }

    public int divisionOfInt(int fistNumber, int secondNumber) {
        numbersValidation(fistNumber, secondNumber);
        int answer = fistNumber / secondNumber;
        return answer;

    }
}


