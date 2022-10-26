/*
   First negative integer in every window of size k
   Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.
   
   Example 1:
   
   Input : 
   N = 5
   A[] = {-8, 2, 3, -6, 10}
   K = 2
   Output : 
   -8 0 -6 -6
   Explanation :
   First negative integer for each window of size k
   {-8, 2} = -8
   {2, 3} = 0 (does not contain a negative integer)
   {3, -6} = -6
   {-6, 10} = -6
    
   Example 2:
   Input : 
   N = 8
   A[] = {12, -1, -7, 8, -15, 30, 16, 28}
   K = 3
   Output :
   -1 -1 -7 -15 -15 0 
*/


import java.util.ArrayDeque;
import java.util.ArrayList;

public class First_Negative_Number_in_every_Window_of_Size_K {
    public static void firstNegativeNumber(int[] arr, int k){
         /*
           // BruteForce Approach: Using Two pointer(Time Complexity: O(N^2).
           ArrayList<Long> res = new ArrayList<>();
           for (int i = 0; i <= arr.length - k; i++) {
               boolean flag = true;
               for (int j = i; j < i + k; j++) {
                   if (arr[j] < 0) {
                       flag = false;
                       res.add((long) (arr[j]));
                       break;
                   }
               }
               if (flag) {
                   res.add((long) (0));
               }
           }
           System.out.println(res);
        */

        // Optimized Approach: Using Sliding Windows (Time Complexity: O(N) & Space Compleixty: O(1)).
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<Integer> list = new ArrayDeque<>();
        boolean flag = true;
        for(int i = 0; i < k; i++){
            if(arr[i] < 0 && flag == true){
                flag = false;
                res.add(arr[i]);
            }
            if(arr[i] < 0){
                list.add(arr[i]);
            }
        }
        if(flag == true){
            res.add(0);
        }
        if(!list.isEmpty() && arr[0] == list.getFirst()){
            list.removeFirst();
        }
        int i = 1;

        for(int j = k; j < arr.length; j++){
            if(arr[j] < 0){
                list.add(arr[j]);
            }
            if(list.isEmpty()){
                res.add(0);
            }
            else{
                res.add(list.getFirst());
            }
            if(!list.isEmpty() && arr[i] == list.getFirst()){
                list.removeFirst();
            }
            i++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        firstNegativeNumber(arr, k);
    }
}
