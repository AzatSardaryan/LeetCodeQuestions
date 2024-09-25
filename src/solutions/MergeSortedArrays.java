package solutions;

public class MergeSortedArrays {
    /**
     * Merges two sorted arrays, nums1 and nums2, into a single sorted array in non-decreasing order.
     * The merged result is stored in nums1, which has enough space to accommodate all elements.
     *
     * @param nums1 The first sorted array with a length of m + n, where the first m elements are valid
     *              and the remaining n elements are initialized as 0 to hold the merge result.
     * @param m The number of valid elements in nums1.
     * @param nums2 The second sorted array with a length of n.
     * @param n The number of valid elements in nums2.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 'p' is the pointer for the last position in nums1 where the final merged value will be placed.
        int p = m + n - 1;

        // 'p1' is the pointer for the last valid element in nums1 (first m elements).
        int p1 = m - 1;

        // 'p2' is the pointer for the last element of nums2.
        int p2 = n - 1;

        // Iterate as long as there are elements left in both nums1 and nums2.
        while (p1 >= 0 && p2 >= 0) {
            // Compare the current elements of nums1 and nums2.
            // If nums1[p1] is greater than nums2[p2], place it at the current position 'p' in nums1.
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                // Otherwise, place nums2[p2] at nums1[p].
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;  // Move the pointer 'p' left to the next unfilled position.
        }

        // If there are remaining elements in nums2, place them in nums1.
        // We don't need to check nums1 because it is already in place.
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
