/*
 * Write a proram to Make Array Zero by Subtracting Equal Amounts
 * Input: nums = [1,5,0,3,5]
   Output: 3
   Explanation:
   In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
   In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
   In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].
 */

import java.util.*;

public class Make_Array_Zero_By_Subtracting_Equal_Amounts {
    public static int minimumOperations(int[] nums) {
        /*
         * Burteforce Approch
         * 
         * Arrays.sort(nums);
         * int count = 0;
         * for(int i = 0; i < nums.length; i++){
         * if(nums[i] == 0){
         * continue;
         * }
         * int currMin = nums[i];
         * for(int j = i; j < nums.length; j++){
         * nums[j] = nums[j] - currMin;
         * }
         * count++;
         * }
         * return count;
         * 
         */

        // optimized Solution

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                set.add(nums[i]);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 0, 3, 5 };
        int ans = minimumOperations(nums);
        System.out.println(ans);
    }
}
