// Write a program to remove all Duplicate character from string.

package recursion;

public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicatesFromString(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        if(map[str.charAt(idx) - 'a']){
            removeDuplicatesFromString(str, idx + 1, newString);
        }
        else{
            newString += str.charAt(idx);
            map[str.charAt(idx) - 'a'] = true;
            removeDuplicatesFromString(str, idx + 1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccdaeefeefab";
        removeDuplicatesFromString(str, 0, "");
    }
}
