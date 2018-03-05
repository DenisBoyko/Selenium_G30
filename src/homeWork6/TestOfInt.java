package homeWork6;

import org.junit.Assert;
import org.junit.Test;



public class TestOfInt {
    DivisionOfTwoNumber divisionOfTwoNumber = new DivisionOfTwoNumber();

    @Test
    public void testPositive(){
        int answer = divisionOfTwoNumber.divisionOfInt(150,2);
        Assert.assertTrue("Division result isn't equals",answer == 75);
    }

    @Test
    public void testPositiveBoundary1(){
        int answer = divisionOfTwoNumber.divisionOfInt(1000,5);
        Assert.assertTrue("Division result isn't equals",answer == 200);
    }

    @Test
    public void testPositiveBoundary2(){
        int answer = divisionOfTwoNumber.divisionOfInt(-1000,-200);;
        Assert.assertTrue("Division result isn't equals",answer == 5);
    }


    @Test
    public void testNegativeOutOfRange1(){
        int answer = divisionOfTwoNumber.divisionOfInt(1001,2);;
        Assert.assertTrue("Division result isn't equals",answer == 500);
    }

    @Test
    public void testNegativeOutOfRange2(){
        int answer = divisionOfTwoNumber.divisionOfInt(-10001,2);;
        Assert.assertTrue("Division result isn't equals",answer == 500);
    }

}
