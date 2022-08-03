// Write a program to print unique subsequences of a string.

package recursion;

import java.util.HashSet;

public class UniqueSubsequence {
    public static void printUniqueSbubsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // choice to be
        printUniqueSbubsequence(str, idx + 1, newString + currChar, set);

        // choice not to be
        printUniqueSbubsequence(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUniqueSbubsequence(str, 0, "", set);
    }
}
