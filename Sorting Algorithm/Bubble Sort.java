/* Write a program to Sort an array by using bubble sort */

public class BubbleSort {
    public static void bubbleSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 1, 5};
        bubbleSort(nums);
        
        // printing Array after Soring
        for(int values: nums){
            System.out.print(values + " ");
        }
    }
}
