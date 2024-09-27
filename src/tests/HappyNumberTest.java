package tests;
import solutions.HappyNumber;

public class HappyNumberTest {
    public static void runTests(){
        int test1 = 19;
        int test2 = 2;

        System.out.println("Test 1: " + HappyNumber.isHappy(test1) + " | Expected: true");
        System.out.println("Test 2: " + HappyNumber.isHappy(test2) + " | Expected: false");
    }
}
