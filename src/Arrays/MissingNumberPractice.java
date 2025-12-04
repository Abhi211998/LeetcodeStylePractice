package Arrays;

import java.util.*;

public class MissingNumberPractice {

    // TODO: Approach 1 — Sorting or HashSet (optional brute)
    public static int missingNumberBrute(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : nums){
            hashSet.add(num);
        }

        for(int i=0; i<nums.length; i++){
            if(!hashSet.contains(i)){
                return i;
            }
        }
        return -1; // TODO
    }

    // TODO: Approach 2 — Sum formula
    public static int missingNumberSum(int[] nums) {

        int sum = 0;
        int n = nums.length;
        for(int num : nums){
            sum += num;
        }
        return n*(n+1)/2 - sum;
    }

    // TODO: Approach 3 — XOR (optimal)
    public static int missingNumberXOR(int[] nums) {

        return 0; // TODO
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        System.out.println("Brute: " + missingNumberBrute(nums));
        System.out.println("Sum:   " + missingNumberSum(nums));
        System.out.println("XOR:   " + missingNumberXOR(nums));
    }
}
