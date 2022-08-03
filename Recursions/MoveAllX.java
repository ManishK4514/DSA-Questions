// Write a program to move all 'x' at the end of the String.

package recursion;

public class MoveAllX {
    public static int count = 0;
    public static void MoveAllXToEnd(String str, int idx, String newString){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx) == 'x'){
            count++;
            MoveAllXToEnd(str, idx + 1, newString);
        }
        else{
            newString += str.charAt(idx);
            MoveAllXToEnd(str, idx + 1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        MoveAllXToEnd(str, 0, "");
    }
}
