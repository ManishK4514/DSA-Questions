// There is only one repeated number in nums, return this repeated number
// Example:
// Input: nums = [1,3,4,2,2]
// Output: 2

package Arrays;

import java.util.*; 

public class Duplicate {
    /* 
    Solution - 01: 
    public static int findDuplicate(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[i + 1]){
                return nums[i];
              }
            }
        }
        return 0;
    }
    Note: This is not the optimal solution
    because time complexity = O(N * N), Space complexity: O(1)
    */

    /* 
    Solution - 02: 
    public static int findDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return nums[i];
            }
        }
        return 0;
    }
    Note: This is not the optimal solution
    because time complexity = O(N log n), Space complexity: O(1)
    */


    /*
    Solution - 03 
    public static int findDuplicate(int[] nums){
        int n = nums.length;
        int freq[] = new int[n + 1];
        for(int i = 0; i < n - 1; i++){
            if(freq[nums[i]] == 0){
                freq[nums[i]] += 1;
            }
            else{
                return nums[i];
            }
        }
        return 0;
    }
    Note: This is also not the optimal solution
    because time complexity = O(N), Space complexity: O(N)
    */

    /*
    Solution: 03 👇👇👇
    Note: This is the optimal solution
    because time complexity = O(N), Space complexity: O(1)
    */
    public static int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] nums = { 3, 1, 3, 4, 2 };
        // Arrays.sort(nums); ---> This is for the first solution
        int duplicate = findDuplicate(nums);
        System.out.println("The duplicate number is: " + duplicate);
    }
}
