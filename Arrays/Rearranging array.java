/*  Write a program to re-arrange an array into the given form.
    Input
    n = 5;
    arr[] = {4, 5, 1, 2, 3}
    Output
    arr[] = {1, 5, 2, 4, 3}
    Explanation:
    In the first example minimum element is 1,
    maximum element is 5, second minimum is
    2 and so on, thus the rearranged array is
    [1, 5, 2, 4, 3]
*/

import java.util.Arrays;

public class Re_Arrange_an_Array {
    public static void reArrange(int[] arr, int n, int[] answer) {
        Arrays.sort(arr);
        int i = 0, j = n - 1, k = 0;
        while (k < answer.length) {
            answer[k] = arr[i];
            k++;
            i++;
            if (j > n / 2) {
                answer[k] = arr[j];
                k++;
                j--;
            }
        }
        for (int values : answer) {
            System.out.print(values + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] answer = new int[arr.length];
        reArrange(arr, arr.length, answer);
    }
}
