package Arrays.VIP;

import java.util.*;

public class MaxSubarraySum {

    // TODO: Implement the brute force solution here
    // Time: O(n^2) or O(n^3) depending on your approach
    public static int maxSubarrayBrute(int[] nums) {

        int result = nums[0];

        for(int i=0; i<nums.length; i++){

            int currSum = 0;
            for(int j=i; j<nums.length; j++){

                currSum = currSum + nums[j];
                result = Math.max(currSum, result);
            }
        }
        return result;
    }

    // TODO: Implement the optimized Kadane's algorithm here
    // Time: O(n)
    public static int maxSubarrayKadane(int[] nums) {

        int currSum = nums[0];
        int maxSumSoFar = nums[0];

        for(int i=1; i<nums.length; i++){

            currSum = Math.max(nums[i] , currSum + nums[i]);

            maxSumSoFar = Math.max(maxSumSoFar , currSum);
        }

        return maxSumSoFar;
    }


    public static void main(String[] args) {

        // You can modify the array for testing different cases
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Array: " + Arrays.toString(nums));

        int bruteAns = maxSubarrayBrute(nums);
        System.out.println("Brute Force Result: " + bruteAns);

        int kadaneAns = maxSubarrayKadane(nums);
        System.out.println("Kadane Result: " + kadaneAns);
    }
}
