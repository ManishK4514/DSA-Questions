/*
 * Input : Arr[] = {1, 2, 3, 4, 5}, Q = 3
   queries[] = {0, 2, 1, 3, 0, 4}
   Output : 2 3 3
   Explanation:
   Here we can see that the array of 
   integers is [1, 2, 3, 4, 5].
   Query 1: L = 0 and R = 2
   Sum = 6
   Integer Count = 3
   So, Mean is 2
   Query 2: L = 1 and R = 3
   Sum = 9
   Integer Count = 3
   So, Mean is 3
   Query 3: L = 0 and R = 4
   Sum = 15
   Integer Count = 5
   So, the Mean is 3.
   So, In the end, the function will 
   return the array [2, 3, 3] as an answer.
 */

import java.util.*;

public class Mean_of_range_in_array {
    public static ArrayList<Integer> findMean(int arr[], int queries[], int n, int q) {
        ArrayList<Integer> ans = new ArrayList<>();
        int l = 0, r = 0, sum = 0, count = 0;
        for (int i = 0; i < q; i += 2) {
            l = queries[i];
            r = queries[i + 1];
            sum = 0;
            count = 0;
            for (int j = l; j <= r; j++) {
                sum += arr[j];
                count++;
            }
            ans.add(sum / count);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int Q = 3;
        int queries[] = { 0, 2, 1, 3, 0, 4 };
        ArrayList<Integer> ans = findMean(arr, queries, arr.length, queries.length);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
