package tests;

import solutions.ValidPalindrome;

public class ValidPalindromeTest {
    public static void runTests() {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";

        System.out.println("Test 1: "  + ValidPalindrome.isPalindrome(test1) + "| Expected: true");
        System.out.println("Test 2: "  + ValidPalindrome.isPalindrome(test2) + "| Expected: false");
        System.out.println("Test 3: "  + ValidPalindrome.isPalindrome(test3) + "| Expected: true");
    }
}
