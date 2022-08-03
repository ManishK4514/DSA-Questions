// Write a program to print all subset of array.

package recursion;

import java.util.ArrayList;

public class SubsetsOfArray {
    public static void printSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubset(int arr[], int idx, ArrayList<Integer> subset) {
        if (idx == arr.length) {
            printSubset(subset);
            return;
        }
        // will add
        subset.add(arr[idx]);
        findSubset(arr, idx + 1, subset);
        subset.remove(subset.size() - 1);

        // will not add;
        findSubset(arr, idx + 1, subset);
    }

    public static void main(String args[]) {
        int arr[] = { 3, 1, 2};
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(arr, 0, subset);
    }

}
