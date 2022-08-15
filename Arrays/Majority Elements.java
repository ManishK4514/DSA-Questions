import java.util.*;

public class Majority_Elements {
    public static int findMajorityElements(int[] nums){
        /* 
        // BruteForce Solution O(n^2)
        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            count = 0;
            for(int j = 0; j < nums.length; j++){
                if(curr == nums[j]){
                    count++;
                }
            }
            if(maxFreq < count){
                maxFreq = count;
                ans = curr;
            }
        }
        if(maxFreq > nums.length/2){
            return ans;
        }
        else{
            return 0;
        }
        */
        
        /* 
        // Sorting Solution O(NlogN)
        Arrays.sort(nums);
        int count = 1, max = Integer.MIN_VALUE, ans = 0;
        if(nums.length > 1){
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] == nums[i + 1]){
                    count++;
                }
                else{
                    count = 1;
                }
                if(max < count){
                    max = count;
                    ans = nums[i];
                }
            }
            if(max > nums.length/2){
                return ans;
            }
            else{
                return -1;
            }
        }
        else{
            return nums[0];
        }
        */

        // Optimized Approch O(N) --> Moore's Voting Algorithm
        int ansIndex = 0;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[ansIndex]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                ansIndex = i;
                count = 1;
            }
        }
        int ans = nums[ansIndex];
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(ans == nums[i]){
                temp++;
            }
        }
        if(temp > nums.length/2){
            return ans;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] nums = {6,6,6,7,7};
        int ans = findMajorityElements(nums);
        System.out.println(ans);
    }
}
