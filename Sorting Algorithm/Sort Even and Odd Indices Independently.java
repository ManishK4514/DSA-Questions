/*
 * Q. Sort an array such that Even and Odd Indices Independently means even places should be in ascending order and Odd places must be in descending order.
 * Leetcode(2164)
 * 
 * You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:

   Sort the values at odd indices of nums in non-increasing order.
   For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
   Sort the values at even indices of nums in non-decreasing order.
   For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.

   Example 1:
   Input: nums = [4,1,2,3]
   Output: [2,3,4,1]
 */

import java.util.Arrays;
import java.util.Scanner;

public class AlternetSort {
    public static void sortOddAndEvenPlaces(int[] nums){
        // Sorting even places in ascending order
        for(int i = 0; i < nums.length ;i+=2){
            for(int j = i + 2; j < nums.length; j+=2){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        // Sorting odd places in descending order
        for(int i = 1; i < nums.length - 1; i+= 2){
            for(int j = i + 2; j < nums.length; j+= 2){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        sortOddAndEvenPlaces(arr);
    }
}
