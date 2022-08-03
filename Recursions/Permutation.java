// Print all permutations of a string.

package recursion;

public class Permutation {
    public static void printPermutation(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newString, permutation + currChar);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "");
    }
}
