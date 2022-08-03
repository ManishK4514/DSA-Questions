// Write a program to calculate factorial of a number.

package recursion;

public class Factorial {
    public static int calculateFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        calculateFactorial(n);
        System.out.println(calculateFactorial(n));
    }
}
