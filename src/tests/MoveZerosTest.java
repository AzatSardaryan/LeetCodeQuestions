package tests;

import solutions.MoveZeros;

import java.util.Arrays;

public class MoveZerosTest {
    public static void runTests() {
        int[] nums = new int[]{0,1,0,3,12};
        MoveZeros.moveZeros(nums);
        System.out.println("Test 1: " + Arrays.toString(nums) + "| Expected: [1, 3, 12, 0, 0]");
    }
}
