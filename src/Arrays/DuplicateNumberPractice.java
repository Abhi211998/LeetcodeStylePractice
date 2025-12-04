//You are given an array nums containing n + 1 integers.
//        Each integer is in the range [1, n], and exactly one number appears more than once.
//
//        Return the duplicate number.
//
//        You must solve it without modifying the array and using constant O(1) space.
//
//        Example:
//
//        Input: nums = [1,3,4,2,2]
//        Output: 2

package Arrays;

import java.util.*;

public class DuplicateNumberPractice {

    // TODO: Approach 1 — Sorting or HashSet (brute) | Time - O(n), Space  - O(n)
    public static int findDuplicateBrute(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : nums){
            if(hashSet.contains(num)){
                return num;
            }
            hashSet.add(num);
        }
        return -1;
    }

    // TODO: Approach 2 — Floyd's Cycle Detection (optimal) | Time - O(n), Space - O(1)
    public static int findDuplicateFloyd(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        //Find intersection point:
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow != fast);

        // Move slow to start:
        slow = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        System.out.println("Brute:  " + findDuplicateBrute(nums));
        System.out.println("Floyd:  " + findDuplicateFloyd(nums));
    }
}
