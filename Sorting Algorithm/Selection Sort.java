// Write a program to sort an array using Selection sort

public class SelectionSort {
    public static void selectionSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            int smallest = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[smallest] > nums[j]){
                    smallest = j;
                }
            }
            // swap
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};
        selectionSort(nums);
        
        // printing Array after Soring
        for(int values: nums){
            System.out.print(values + " ");
        }
    }
}
