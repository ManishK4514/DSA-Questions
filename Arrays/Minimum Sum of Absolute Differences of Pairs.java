/*
 * Input:
   N = 4
   A = {4,1,8,7}
   B = {2,3,6,5}
   Output:
   6
   Explanation:
   If we take the pairings as (1,2), (4,3),
   (7,5), and (8,6), the sum will be S =
   |1 - 2| + |4 - 3| + |7 - 5| + |8 - 6| = 6.
   It can be shown that this is the minimum sum we can get.
 */
import java.util.*;
public class Minimum_Sum_of_Absolute_Differences_of_Pairs {
    public static long findMinSum(int[] A,int[] B,int N) { 
        Arrays.sort(A);
        Arrays.sort(B);
        long sum = 0;
        int temp = 0;
        for(int i = 0; i < N; i++){
            temp = A[i] - B[i];
            if(temp < 0){
                temp = -1 * temp;
            }
            sum += temp;
        }
        return sum;
    }
    public static void main(String[] args) {
        int N = 4;
        int[] A = {4,1,8,7};
        int[] B = {2,3,6,5};
        long minSum = findMinSum(A, B, N);
        System.out.println(minSum);
    }
}
