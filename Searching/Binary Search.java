// Write a program to search an element from an array by using linear search.

public class BinarySearch {
    public static void binarySearch(int[] nums, int target){
        // Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                System.out.println("Element found at location: " + mid);
                break;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 9, 32, 94, 105};
        int target = 94;
        binarySearch(nums, target);
    }
}
