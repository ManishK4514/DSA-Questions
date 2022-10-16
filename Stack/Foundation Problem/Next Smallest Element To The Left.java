/*
    Next Smallest Element To The Left Using Stack
    Problem Statement: Find the next Smallest element to the Left for the each element.
    
    Examples:
    
    Example 1:     
    Input: N = 11, A[] = {3,10,4,2,1,2,6,1,7,2,9}    
    Output: -1, 3, 3, -1, -1, 1, 2, -1, 1, 1, 2
    
    
    Example 2:    
    Input:  N = 6, A[] = {5,7,1,7,6,0}    
    Output: -1, 5, -1, -1, 1, -1
*/

import java.util.Arrays;
import java.util.Stack;

public class Next_Smaller_ELement_To_The_Left {
    public static int[] nextSmallerElementsToRight(int[] arr){
        /*
           // BruteForce Approach: Time Complexity: O(N^2) & Space Complexity: O(1).
           int n = arr.length;
           int[] ans = new int[n];
           for(int i = n - 1; i >= 0; i--){
               boolean flag = true;
               for(int j = i - 1; j >= 0; j--){
                   if(arr[i] > arr[j]){
                       ans[i] = arr[j];
                       flag = false;
                       break;
                   }
               }
               if(flag){
                   ans[i] = -1;
               }
           }
           return ans;
        */
        
        // Optimized Approach: Time Complexity: O(N) & Space Complexity: O(1).
        
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            if(stack.empty()){
                ans[i] = -1;
            }
            while(!stack.empty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.empty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,10,4,2,1,2,6,1,7,2,9};  
        System.out.println(Arrays.toString(nextSmallerElementsToRight(arr)));
    }
}
