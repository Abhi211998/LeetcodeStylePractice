package Arrays;

import java.util.*;

public class MoveZeroes {

    // Two pointer technique to move zeroes to end:
    public static void moveZeroes(int[] nums) {

        int j = 0;

        if (nums == null || nums.length < 2) return;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0 && nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j] != 0){
                j++;
            }
        }


    }

    public static void main(String[] args) {

        // Test array — modify as needed
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before: " + Arrays.toString(nums));

        // Call your function
        moveZeroes(nums);

        System.out.println("After:  " + Arrays.toString(nums));
    }
}
