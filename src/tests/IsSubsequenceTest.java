package tests;
import solutions.IsSubsequence;

public class IsSubsequenceTest {
    public static void runTests(){
        String s = "abc";
        String t = "ahbgdc";
        System.out.println("Test 1: " + IsSubsequence.isSubsequence(s, t)  + " | Expected True");

        s = "axc";
        IsSubsequence.isSubsequence(s, t);
        System.out.println("Test 2: " + IsSubsequence.isSubsequence(s, t)  + " | Expected False");

    }
}
