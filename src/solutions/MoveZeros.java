package solutions;

public class MoveZeros {
    public static void moveZeros(int[] nums) {
        int left = 0;
        int right = 0;

        for(right = 0; right < nums.length; right++) {
            if(nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
