/*Q.Key Pair (GFG) --> https://practice.geeksforgeeks.org/problems/key-pair5616/1?page=1&difficulty[]=-1&difficulty[]=0&company[]=SAP%20Labs&category[]=Arrays&sortBy=accuracy
   Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
   Example 1:
   Input:
   N = 6, X = 16
   Arr[] = {1, 4, 45, 6, 10, 8}
   Output: Yes
   Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
 */

import java.util.*;

public class Key_Pair_Is_Equal_to_Sum {
    static boolean pairSum(int arr[], int n, int x) {
        /*
         * BurteForce Approach: O(N ^ N)
           for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == x){
                    return true;
                }
            }
           
            return false;
        */
        // Solution 2: Time complexity: O(N)
        Arrays.sort(arr);
        int sum = 0;
        int si = 0;
        int ei = n - 1;
        while(si < ei){
            sum = arr[si] + arr[ei];
            if(sum == x){
                return true;
            }
            if(sum > x){
                ei--;
            }
            else{
                si++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int N = 6, X = 16;
        int Arr[] = {1, 4, 45, 6, 10, 8};
        boolean ans = pairSum(Arr, N, X);
        System.out.println(ans);
    }
}
