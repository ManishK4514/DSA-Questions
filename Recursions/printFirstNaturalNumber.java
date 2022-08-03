// Write a program to print first n natural number.

package recursion;

class printFirstNaturalNumber {
    public static void printNumber(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n + " ");
            printNumber(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
    }
}