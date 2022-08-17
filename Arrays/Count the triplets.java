/*
 * Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
 * Example 1:

   Input:
   N = 4
   arr[] = {1, 5, 3, 2}
   Output: 2
   Explanation: There are 2 triplets: 
   1 + 2 = 3 and 3 +2 = 5 
 */

// import java.util.Arrays; --> for solution: 01
import java.util.HashSet;
public class Count_the_triplets {
    static int countTriplet(int arr[], int n) {
        /*
           Solution: 01
         * BruteForce Approach: Time complexity: O(N ^ N ^ N)
         * static int countTriplet(int arr[], int n) {
         * int temp = 0;
         * int count = 0;
         * for(int i = 0; i < arr.length - 1; i++){
         * for(int j = i + 1; j < arr.length; j++){
         * temp = arr[i] + arr[j];
         * int k = 0;
         * while(k < n){
         * if(temp == arr[k]){
         * count++;
         * break;
         * }
         * k++;
         * }
         * }
         * }
         * return count;
         */
    
        // Solution 02: time complexity: O(N^N) & space complexity O(N)

        HashSet<Integer> set = new HashSet<>();
        for(int values: arr){
            set.add(values);
        }
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(set.contains(arr[i] + arr[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int N = 4;
        int arr[] = { 1, 5, 3, 2 };
        int ans = countTriplet(arr, N);
        System.out.println(ans);
    }
}
