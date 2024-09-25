package tests;

import java.util.Arrays;
import solutions.MergeSortedArrays;

public class MergeSortedArraysTest {
    public static void runTests() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3, n = 3;

        MergeSortedArrays.merge(nums1 , m, nums2, n);
        System.out.println("Test 1: " + Arrays.toString(nums1) + " | Expected: [1, 2, 2, 3, 5, 6]");


        nums1 = new int[]{1};
        nums2 = new int[]{};
        m = 1;
        n = 0;
        MergeSortedArrays.merge(nums1 , m, nums2, n);
        System.out.println("Test 2: " + Arrays.toString(nums1) + " | Expected: [1, 2, 3, 5, 6]");

        nums1 = new int[]{0};
        nums2 = new int[]{1};
        m = 0;
        n = 1;

        MergeSortedArrays.merge(nums1, m, nums2, n);
        System.out.println("Test 3: " + Arrays.toString(nums1) + " | Expected: [1]");
    }
}