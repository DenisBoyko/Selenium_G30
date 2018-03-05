package jUnit;
import org.junit.*;

public class JunitTests {
    String testString = new String ("Test of String");

    @BeforeClass
    public static void beforeAllTest(){
        System.out.println("Before all");
    }

    @Before
    public void beforeTest(){
        System.out.println("Before");
    }

    @Test
    public void test1(){
        System.out.println("Test1");
        System.out.println(testString);
    }

    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @After
    public void afterTest(){
        System.out.println("After");
    }

    @AfterClass
    public static void afterAllTests(){
        //System.out.println(testString);
        System.out.println("After all");
    }

}
