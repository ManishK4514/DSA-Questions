/* Q. Write a program to form largest number from digits given in the array.
 * Input:
   N = 5
   A[] = {9, 0, 1, 3, 0}
   Output:
   93100
   Explanation:
   Largest number is 93100 which
   can be formed from array digits.
 */

import java.util.*;
public class Form_largest_number_from_digits {
    public static String MaxNumber(long arr[], long n)
    {
        /*
            Solution 1: Time complexity: O(NLogN) & Space Complexity: O(N)
            Arrays.sort(arr);
            long num = arr[arr.length - 1];
            for(int i = arr.length - 1; i > 0; i--){
                num = num * 10 + arr[i - 1];
            }
            String ans = Long.toString(num);
            return ans;
        */

        // Solution 2:
        Arrays.sort(arr);
        StringBuilder ans = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--){
            ans.append(arr[i]);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        long N = 5;
        long arr[] = {9, 0, 1, 3, 0};
        System.out.println(MaxNumber(arr, N));
    }
}
