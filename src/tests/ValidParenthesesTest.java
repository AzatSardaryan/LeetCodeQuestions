package tests;

import solutions.ValidParentheses;

public class ValidParenthesesTest {
    public static void runTests() {
        String s = "([])";
        System.out.println("Test 1: " + ValidParentheses.isValid(s) + " | Expected: true");

        s = "(]";
        System.out.println("Test 2: " + ValidParentheses.isValid(s) + " | Expected: false");

        s = "([{}])";
        System.out.println("Test 3: " + ValidParentheses.isValid(s) + " | Expected: true");

        s = "({[})]";
        System.out.println("Test 4: " + ValidParentheses.isValid(s) + " | Expected: false");
    }
}
