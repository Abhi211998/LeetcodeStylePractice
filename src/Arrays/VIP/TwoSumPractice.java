package Arrays.VIP;

import java.util.*;

public class TwoSumPractice {

    // TODO: Implement your brute force solution here
    public static int[] twoSumBrute(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // TODO: Implement your optimized hashmap solution here
    public static int[] twoSumOptimized(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        // You can edit the array & target for testing
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call your methods and print results
        int[] bruteResult = twoSumBrute(nums, target);
        System.out.println("Brute Result: " + Arrays.toString(bruteResult));

        int[] optimizedResult = twoSumOptimized(nums, target);
        System.out.println("Optimized Result: " + Arrays.toString(optimizedResult));
    }
}
