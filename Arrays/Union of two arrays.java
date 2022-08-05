/* Write a program to find the Union of two arrays and return their length (arr.length)
Input: 5 3
       1 2 3 4 5
       1 2 3

Output: 5

Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.

*/
import java.util.*;

public class UnionOfTwoArrays {
    public static int doUnion(int arr1[], int m, int arr2[], int n) 
    {
        /*  brute Force Solution
        int[] temp = new int[m + n];

        // copying arr1 elements in temp array.
        for(int i = 0, k = 0; i < m; i++, k++){
            temp[k] = arr1[i];
        }
        // copying arr2 elements in temp array.
        for(int i = 0, k = m; i < n; i++, k++){
            temp[k] = arr2[i];
        }
        // counting the unique item in the array.
        int count = 0;
        for(int i = 0; i < temp.length; i++){
            for(int j = i + 1; j < temp.length; j++){
                if(temp[j] == temp[i]){
                    count++;
                }
            }
        }
        // unique items = total items - duplicate items.
        int ans = temp.length - count;
        return ans;
        */

        // Optimized Solution
        HashMap <Integer, Integer>  map = new HashMap<>();
        for(int i = 0;  i < m; i++){
            if(map.containsKey(arr1[i])){
                // map.remove(arr1[i]);
                continue;
            }
            else{
                map.put(arr1[i], i);
            }
        }
        for(int i = 0;  i < n; i++){
            if(map.containsKey(arr2[i])){
                // map.remove(arr2[i]);
                continue;
            }
            else{
                map.put(arr2[i], i);
            }
        }
        return map.size();
    }
    public static void main(String[] args) {
        int[] a = {6, 2}; 
        int[] b = {85, 25, 1, 32, 54, 6};
        doUnion(a, a.length, b, b.length);
        System.out.println(doUnion(a, a.length, b, b.length));
    }
}
