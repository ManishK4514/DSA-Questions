/*  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    Input: nums = [2,2,1]
    Output: 1

*/

public class Single_Number_In_Array {
    public static int singleNumber(int[] nums) {
        /*
         * BruteForce Solution O(N^2)
         * int count = 0;
           for (int i = 0; i < nums.length; i++) {
                count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
                if (count % 2 != 0) {
                    return nums[i];
                }
            }
            return -1;
         */

        // Optimized Solution O(N)
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
        ans ^= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        int ans = singleNumber(nums);
        System.out.println("The Single Number is: " + ans);
    }
}
