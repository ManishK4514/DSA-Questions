/* Kadane's Algorithm - find Largest sum contiguous Subarray
   Input:
   N = 5
   Arr[] = {1,2,3,-2,5}
   Output:
   9
   Explanation:
   Max subarray sum is 9
   of elements (1, 2, 3, -2, 5) which 
   is a contiguous subarray.

*/
public class findLargestSumContiguousSubarray {
    public static void largestSum(int[] arr, int n) {
        /*
         * BruteForce Approach
         * int max = Integer.MIN_VALUE;
         * int ans = 0;
         * for(int i = 0; i < arr.length; i++){
         * for(int j = i; j < arr.length; j++){
         * int sum = 0;
         * for(int k = i; k <= j; k++){
         * sum += arr[k];
         * }
         * if(sum > max){
         * max = sum;
         * }
         * ans = max;
         * }
         * }
         * System.out.println(ans);
         */

        // Optimized Approach
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
                ans = max;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -2, 5 };
        largestSum(arr, arr.length);
    }
}
