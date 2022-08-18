/*
 * Q. Write a program to find the number which is not present in the arary between range(1 to N)
 * Example 1:
   Input: nums = [4,3,2,7,8,2,3,1]
   Output: [5,6]
   
   Example 2:
   Input: nums = [1,1]
   Output: [2]
 */

import java.util.ArrayList;
import java.util.HashSet;
public class Find_All_Numbers_Disappeared_in_an_Array {
    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        /* brueForce approach --> Time complexity: O(N ^ N) & Space complexity: O(N)
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        boolean flag = false;
        for(int i = 1; i <= n; i++){
            flag = false;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == i){
                    flag = true;
                }
            }
            if(!flag){
                ans.add(i);
            }
        }
        return ans;
        */
        
        /* Solution 2: Time complexity: O(N) & SPace complexity: 2N 0r O(N)
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
        */
        
        // Solution 3: Time complexity: (N ^ K) & Space complexity: O(N)
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = findDisappearedNumbers(nums);;
        System.out.println(ans);
    }
}
