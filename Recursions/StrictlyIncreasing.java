// Check if an array is sorted (Strictly Increasing).

package recursion;

public class StrictlyIncreasing {
    public static boolean checkSortedArray(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return checkSortedArray(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        checkSortedArray(arr, 0);
        System.out.println(checkSortedArray(arr, 0));
    }
}
