/*
    Next Greater Element To The Left Using Stack
    Problem Statement: Find the next Greater element to the right for the every element.
    
    Examples:
    
    Example 1:     
    Input: N = 11, A[] = {3,10,4,2,1,2,6,1,7,2,9}    
    Output: -1, -1, 10, 4, 2, 4, 10, 6, 10, 7, 10
    
    
    Example 2:    
    Input:  N = 6, A[] = {5,7,1,7,6,0}    
    Output: -1, -1, 7, -1, 7, 6
*/

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_To_Left {
    public static int[] nextGreaterElementsToLeft(int[] arr) {
        /*
           // BruteForce Approach: Time Complexity: O(N^2) & Space Complexity: O(1).
           int n = arr.length;
           int[] ans = new int[n];
           for(int i = n - 1; i >= 1; i--){
               boolean flag = true;
               for(int j = i - 1; j >= 0; j--){
                   if(arr[j] > arr[i]){
                       ans[i] = arr[j];
                       flag = false;
                       break;
                   }
               }
               if(flag){
                   ans[i] = -1;
               }
           }
           ans[0] = -1;
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
            while(!stack.empty() && stack.peek() <= arr[i]){
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
        System.out.println(Arrays.toString(nextGreaterElementsToLeft(arr)));
    }
}
