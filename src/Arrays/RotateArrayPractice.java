//Problem 1 — Rotate Array (General Rotation, Left or Right)
//
//        Difficulty: Easy–Medium
//
//        You are given an integer array nums and an integer k.
//        Your task is to rotate the array in-place by k steps.
//
//        If k is positive, rotate the array to the right.
//
//        If k is negative, rotate the array to the left.
//
//        Rotation should be done in-place, using O(1) extra space.
//
//        Example 1:
//
//        Input:  nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        Rotate right by 3.
//
//
//        Example 2:
//
//        Input:  nums = [1,2,3,4,5,6,7], k = -2
//        Output: [3,4,5,6,7,1,2]
//        Explanation:
//        Rotate left by 2.
//
//
//        Constraints:
//
//        1 <= nums.length <= 10^5
//
//        -10^9 <= k <= 10^9
//
//        Must run in O(n) time and O(1) extra space.
//
//        ✅ Problem 2 — Rotate Array to the Right by k Steps
//
//        Difficulty: Medium
//
//        Given an integer array nums and an integer k, rotate the array to the right by k steps.
//
//        Rotation should be done without using extra arrays (O(1) space).
//        Your algorithm must run in O(n) time.
//
//        Example:
//
//        Input:  nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]

package Arrays;

import java.util.*;

public class RotateArrayPractice {

    // Rotate right by k using extra array (O(n) space)
    public static void rotateRightExtra(int[] nums, int k) {

    }

    // Rotate right by k using reverse method (in-place)
    public static void rotateRightReverse(int[] nums, int k) {
        // TODO
    }

    // Rotate left by k using extra array (O(n) space)
    public static void rotateLeftExtra(int[] nums, int k) {
        // TODO
    }

    // Rotate left by k using reverse method (in-place)
    public static void rotateLeftReverse(int[] nums, int k) {
        // TODO
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int k = 3;

        // Test any method:
        int[] arr = Arrays.copyOf(a, a.length);
        rotateRightReverse(arr, k);
        System.out.println("RightReverse: " + Arrays.toString(arr));

        arr = Arrays.copyOf(a, a.length);
        rotateRightExtra(arr, k);
        System.out.println("RightExtra:   " + Arrays.toString(arr));

        arr = Arrays.copyOf(a, a.length);
        rotateLeftReverse(arr, k);
        System.out.println("LeftReverse:  " + Arrays.toString(arr));

        arr = Arrays.copyOf(a, a.length);
        rotateLeftExtra(arr, k);
        System.out.println("LeftExtra:    " + Arrays.toString(arr));
    }
}
