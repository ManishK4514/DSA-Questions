// Write a program to print String in reverse.

package recursion;

public class PrintReverseString {
    public static void printStringInReverse(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printStringInReverse(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "Manish";
        printStringInReverse(str, str.length() - 1);
    }
}
