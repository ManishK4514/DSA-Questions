// Write a program to reverse the string 
// Example: Input:
//         s = Geeks
//         Output: skeeG

package Strings;

public class ReverseString{
    public static String ReverseWord(String str){
        int i = 0;
        int j = str.length() - 1;
        char[] ch = str.toCharArray();
        while(i <= j){
            char temp = ch[i];
            ch[i] =  ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "Geeks";
        System.out.println(ReverseWord(str));
    }
}
