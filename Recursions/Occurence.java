// Write a program to track first and last occurence of a character in String str.

package recursion;

public class Occurence {
    public static int first = -1;
    public static int last = -1;

    public static void countOccurence(String str, int idx) {
        if (idx == str.length() - 1) {
            System.out.println("First occurence at index: " + first);
            System.out.println("Last occurence at index: " + last);
            return;
        }
        if (str.charAt(idx) == 'a') {
            if (first == -1) {
                first = idx;
            }
            last = idx;
        }
        countOccurence(str, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaahdjfkdadkjfadjfkdadf";
        countOccurence(str, 0);
    }
}
