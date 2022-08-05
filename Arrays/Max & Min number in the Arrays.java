// Write a program to find the min and max number in the array and then find their sum.
/*Input:
  N = 5
  A[] = {-2, 1, -4, 5, 3}
  Output: 1
  Explanation: min = -4, max =  5. Sum = -4 + 5 = 1 */

package Arrays;

public class Max_Min{
    public static int findSum(int A[], int N) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }
        int ans = min + max;
        return ans;
    }

    public static void main(String[] args) {
        int A[] = {-2, 1, -4, 5, 3};
        int ans = findSum(A, A.length);
        System.out.println("The sum of the min and max number is: " + ans);
    }
}
