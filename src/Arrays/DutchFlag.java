//Problem Statement — Dutch National Flag (Sort Colors)
//
//You are given an integer array nums where each element is 0, 1, or 2.
//Your task is to sort the array in-place so that all 0s come first, followed by all 1s, then all 2s.
//
//        Constraints:
//
//Do not use the built-in sort function.
//
//Do it in one pass if possible.
//
//Use constant extra space: O(1).
//
//Modify the array in-place.
//
//This is also known as the Dutch National Flag problem (LeetCode 75).
//
//Example:
//
//Input:  nums = [2, 0, 2, 1, 1, 0]
//Output: [0, 0, 1, 1, 2, 2]


package Arrays;

import java.util.*;

public class DutchFlag {

    // TODO: Implement the brute force approach (optional)
    // Example: counting 0s,1s,2s and overwriting array
    public static void sortColorsBrute(int[] nums) {

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            } else if (nums[i] == 1) {
                oneCount++;
            } else if (nums[i] == 2) {
                twoCount++;
            }
        }

        int idx = 0;
        while(zeroCount-- > 0){
            nums[idx++] = 0;
        }
        while(oneCount-- > 0) {
            nums[idx++] = 1;
        }
        while(twoCount-- > 0){
            nums[idx++] = 2;
        }
    }

    // TODO: Implement the Dutch National Flag (three-pointer) solution
    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                mid++;
                high--;
            }
        }

    }


    public static void main(String[] args) {

        // Modify this array to test your solutions
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before: " + Arrays.toString(nums));

        //Calling optomized solution function:
        sortColors(nums);

        System.out.println("After:  " + Arrays.toString(nums));
    }
}

