/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Example 1:

   Input: nums = [0,1,0,3,12]
   Output: [1,3,12,0,0]
 */

public class Move_Zeroes_At_The_End {
    public static int[] moveZeroes(int[] nums) {
        /*
        // BruteForce Solution --> time complexity: O(N) & Space complexity: O(N)
        int[] ans = new int[nums.length];
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                ans[k++] = nums[i];
            }
        }
        while(k < ans.length){
            ans[k++] = 0;
        }
        return ans;
        */
        
        /*
        // Solution - 02 --> time complexity: O(N)
        int k  = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[k++] = nums[i];
            }
        }
        while(k < nums.length){
            nums[k++] = 0;
        }
        return nums;
        */

        // Solution - 03 --> Time complexity O(N);
        int zeros = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeros++;
            }
            else{
                temp = nums[i];
                nums[i] = 0;
                nums[i - zeros] = temp;
            }
        }
        return nums; 
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] ans =moveZeroes(nums);
        for(int values: ans){
            System.out.print(values + " ");
        }
    }
}
