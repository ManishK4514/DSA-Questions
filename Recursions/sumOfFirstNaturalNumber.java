// Write a program to calculate sum of First n natural number.

package recursion;

public class sumOfFirstNaturalNumber {
    public static void calculateSum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        } else {
            sum += n;
            calculateSum(n - 1, sum);
        }
    }

    public static void main(String[] args) {
        int n = 5, sum = 0;
        calculateSum(n, sum);
    }
}
