// Write a program to search an element from an array by using linear search.

public class BinarySearch {
    public static void binarySearch(int[] nums, int target){
        // Arrays.sort(nums);
        int lower = 0;
        int upper = nums.length;
        int mid = 0;
        while(lower <= upper){
            mid = (lower + upper)/2;
            if(nums[mid] == target){
                System.out.println("Element found at location: " + mid);
                break;
            }
            else if(nums[mid] < target){
                lower = mid + 1;
            }
            else{
                upper = mid - 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 9, 32, 94, 105};
        int target = 94;
        binarySearch(nums, target);
    }
}
