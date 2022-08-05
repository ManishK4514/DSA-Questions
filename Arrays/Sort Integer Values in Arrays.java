// Write a program to sort 0's, 1's and 2's without using sorting algorithm.
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

package Arrays;

public class SortInteger {
    public static void sort(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int temp;
        while(mid <= high){
            switch (nums[mid]) {
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
            
                case 1:
                    mid++;
                    break;

                case 2:
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;   
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
