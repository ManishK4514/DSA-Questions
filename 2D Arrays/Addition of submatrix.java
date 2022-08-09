/* Write a program to find the Addition of sub matrix.
   Input: 
   N = 5 , M = 6
   Arr[][] = {{1, 2, 3, 4, 5, 6},
              {7, 8, 9, 10, 11, 12},
              {13, 14, 15, 16, 17, 18},
              {19, 20, 21, 22, 23, 24},
              {25, 26, 27, 28, 29, 30}}
   X1=3, Y1=4, X2=4, Y2=5
   Output: 78
   Explanation: Sum from cell starting at
   position (3, 4) (1-based indexing) and 
   ending at (4, 5) is 78.
*/

public class Addition_of_submatrix {
    public static int subMatrixSum(int arr[][], int m, int n, int x1, int y1, int x2, int y2) {
        int sum = 0;
        // traversing the given sub-matrix and calculating the sum.
        for (int i = x1 - 1; i < x2; i++) {
            for (int j = y1 - 1; j < y2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 },
                { 19, 20, 21, 22, 23, 24 },
                { 25, 26, 27, 28, 29, 30 } };
        int x1 = 3, y1 = 4, x2 = 4, y2 = 5;
        int m = 5, n = 6;
        int ans = subMatrixSum(arr, m, n, x1, y1, x2, y2);
        System.out.println("The sum of the given sub-Matrix is: " + ans);
    }
}
