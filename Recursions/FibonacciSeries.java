// Write a program to get Fibonacci Series.

package recursion;

public class FibonacciSeries {
    public static void printFibonacciSeries(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFibonacciSeries(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1, n = 7;
        System.out.print(a + " ");
        System.out.print(b + " ");
        printFibonacciSeries(a, b, n - 2);
    }
}
