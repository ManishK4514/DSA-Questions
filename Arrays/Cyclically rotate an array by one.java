/* Write a program to Cyclically rotate an array by one
   Example: 01
   Input:
   N = 5
   A[] = {1, 2, 3, 4, 5}
   Output:
   5 1 2 3 4

*/

public class Cyclically_rotate_an_array_by_one {
    public static void cyclic(int[] arr, int n){
        int firstIndex = arr[n - 1];
        for(int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = firstIndex;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        cyclic(arr, arr.length);
        for(int values: arr){
            System.out.print(values + " ");
        }
    }
}
