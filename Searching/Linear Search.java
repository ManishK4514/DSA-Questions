public class LinearSearch {
    public static void linearSearch(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                System.out.println("Element found at location: " + i);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        int target = 3;
        linearSearch(nums, target);
    }
}
