// Counts total paths in a maze to move from (0, 0) to (m, n).

package recursion;

public class CountPath {
    public static int countPathInMatrix(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 || j == n - 1) {
            return 1;
        }
        // move downwards
        int downPaths = countPathInMatrix(i + 1, j, m, n);
        // move right
        int rightPaths = countPathInMatrix(i, j + 1, m, n);
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        countPathInMatrix(0, 0, m, n);
        System.out.println(countPathInMatrix(0, 0, m, n));
    }
}
