//Given an array nums of integers, for each element find the Next Greater Element (NGE) — the first number to the right that is strictly greater than the current element.
//If no such element exists, record -1.
//
//Example:
//Input: [6, 8, 0, 1, 3]
//Output: [8, -1, 1, 3, -1]

package Arrays.MVIP;

import java.util.*;

public class NextGreaterElement {

    // TODO: Brute Force Approach (nested loops)
    public static int[] nextGreaterBrute(int[] nums) {

        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){

            int nextGreater = -1;

            for(int j=i+1; j<nums.length; j++){
                if(nums[j] > nums[i]){
                    nextGreater = nums[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        return result; // placeholder
    }

    // TODO: Optimal Approach using Stack
    public static int[] nextGreaterStack(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        int n = nums.length;

        for(int i=0; i<n; i++){

            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                result[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            result[stack.pop()] = -1;
        }

        return result;

    }

    public static void main(String[] args) {

        int[] nums = {6, 8, 0, 1, 3};

        System.out.println("Brute:  " + Arrays.toString(nextGreaterBrute(nums)));
        System.out.println("Stack:  " + Arrays.toString(nextGreaterStack(nums)));
    }
}

