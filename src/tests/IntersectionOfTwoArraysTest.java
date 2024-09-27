package tests;
import solutions.IntersectionOfTwoArrays;

import java.util.Arrays;

public class IntersectionOfTwoArraysTest {
    public static void runTests(){
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        System.out.println("Test 1: " + Arrays.toString(IntersectionOfTwoArrays.intersection(nums1, nums2)) + " | Expected [2]");


        nums1 = new int[]{4,9,5};
        nums2 = new int[]{9,4,9,8,4};
        System.out.println("Test 2: " + Arrays.toString(IntersectionOfTwoArrays.intersection(nums1, nums2)) + " | Expected [9,4] or [4,9]");
    }
}
