/* Write a program to Minimize the Heights II.
 * Input:
   K = 3, N = 5
   Arr[] = {3, 9, 12, 16, 20}
   Output:
   11
   Explanation:
   The array can be modified as
   {6, 12, 9, 13, 17}. The difference between 
   the largest and the smallest is 17-6 = 11.
 */

import java.util.*;

public class Minimize_the_Heights_II {
    public static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        int mi, ma;
        for (int i = 0; i < n - 1; i++) {
            mi = Math.min(smallest, arr[i + 1] - k);
            ma = Math.max(largest, arr[i] + k);
            if (mi < 0) {
                continue;
            }
            ans = Math.min(ans, ma - mi);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 9, 12, 16, 20 };
        int k = 3;
        int result = getMinDiff(arr, arr.length, k);
        System.out.println(result);
    }
}
