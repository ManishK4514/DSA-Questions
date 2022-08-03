// Write a program to check whether a program is palindrome or not.

package recursion;

public class Palindrome {
    public static boolean isStringPalidrome(String str, int firstIndex, int lastIndex){
        if(firstIndex >= lastIndex){
            return true;
        }
        if(str.charAt(firstIndex) != str.charAt(lastIndex)){
            return false;
        }
        
        return isStringPalidrome(str, firstIndex + 1, lastIndex - 1);
    }
    public static void main(String args[]){
        String str = "malayalam";
        isStringPalidrome(str, 0, str.length() - 1);
        System.out.println(isStringPalidrome(str, 0, str.length() - 1));
    }
}
