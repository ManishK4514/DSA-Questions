// Write a program to Move Negative Values of an array at the end of the Array.
/*
 * Input : 
   N=8
   arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
   Output :
   7  9  10  11  -5  -3  -4  -1
 */

package Arrays;

public class MoveNegativeToEnd {
    public static int[] segregateElements(int arr[], int n) {

        int[] temp = new int[n];
        int count = 0;
        // finding the positive values and inserting at the first
        for (int i = 0, k = 0; i < n; i++) {
            if (arr[i] > 0) {
                count++;
                temp[k] = arr[i];
                k++;
            }
        }

        // finding the negative values and inserting at the end
        for (int i = 0, k = count; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[k] = arr[i];
                k++;
            }
        }
        // copying element to the original array
        for (int i = 0, k = 0; i < temp.length; i++) {
            arr[k] = temp[i];
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 };
        segregateElements(arr, arr.length);

        // Printing Elements
        for (int values : arr) {
            System.out.print(values + " ");
        }
    }
}
