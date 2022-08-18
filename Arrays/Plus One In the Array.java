/*
 * Write a program to add one in the array.
 * Example 1:
   Input: digits = [1, 2, 3]
   Output: [1, 2, 4]

   Example 2:
   Input: digits = [9, 9, 9, 9]
   Output: [1, 0, 0, 0, 0]
 */

import java.util.Arrays;
import java.util.Scanner;

public class Plus_One_in_An_Array {
    public static int[] plusOne(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 9) {
                arr[i]++;
                break;
            } else {
                arr[i] = 0;
            }
        }
        if (arr[0] == 0) {
            int[] newArr = new int[n + 1];
            newArr[0] = 1;
            return newArr;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking the size of the array
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();

        // Initializing and taking Array as an input from the user
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // passing array to the function plus one.
        int[] ans = plusOne(arr, arr.length);

        // printing the Array
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
