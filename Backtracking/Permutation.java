// Write a program to find all possible permutation of a given string.

package backtracking;

public class Permutation {
    public static void PrintPermutation(String str, String combination){
        if(str.length() == 0){
            System.out.println(combination);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            PrintPermutation(newString, combination + currChar);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        PrintPermutation(str, "");
    }
}
