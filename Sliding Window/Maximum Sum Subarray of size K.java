/*
 * Max Sum Subarray of size K
   BasicAccuracy: 52.08%Submissions: 45278Points: 1
   Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
   
   Example 1:
   
   Input:
   N = 4, K = 2
   Arr = [100, 200, 300, 400]
   Output:
   700
   Explanation:
   Arr3  + Arr4 =700,which is maximum.
    
   
   Example 2:
   
   Input:
   N = 4, K = 4
   Arr = [100, 200, 300, 400]
   Output:
   1000
   Explanation: Arr1 + Arr2 + Arr3 + Arr4 =1000,which is maximum.
*/


public class Maximum_Sum_Subarray_of_size_K {
    public static int maximumSum(int[] arr, int k){
        /*
        // BruteForce Approach: Using Two pointer(Time Complexity: O(N^2) & Space Complexity: O(N)).
        int max = Integer.MIN_VALUE;
        int sum = 0;;
        for(int i = 0; i < (arr.length - (k - 1)); i++){
            sum = 0;
            for(int j = i; j < i + k; j++){
                sum += arr[j];
            }
            max = Math.max(max, sum);
            System.out.println(sum);
        }
        return max;
        */

        // Optimized Approach: Using Sliding Windows
        if (arr.length < k){
           System.out.println("Invalid");
           return -1;
        }
      
        // Compute sum of first window of size k
        int res = 0;
        for (int i=0; i<k; i++){
           res += arr[i];
        }   
        int currSum = res;
        for (int i=k; i<arr.length; i++){
           currSum += arr[i] - arr[i-k];
           res = Math.max(res, currSum);
        }
      
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;
        System.out.println(maximumSum(arr, k));
    }
}
