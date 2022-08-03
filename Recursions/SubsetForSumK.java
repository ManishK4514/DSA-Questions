// Write a program to print all subsequences whose sum is k.

package recursion;

import java.util.ArrayList;

public class SubsetForSumK {
    public static void printSubset(ArrayList<Integer> subset){
        if(subset.size() == 0){
            System.out.print("{}");
        }
        for(int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubsetForSumK(int arr[],int idx, ArrayList<Integer> subset ,int sum, int s){
        if(idx == arr.length){
            if(s == sum){
                printSubset(subset);
            }
            return;
        }
        // will take
        subset.add(arr[idx]);
        s += arr[idx];
        findSubsetForSumK(arr, idx + 1, subset, sum, s);
        subset.remove(subset.size() - 1);
        s -= arr[idx];

        // will not take
        findSubsetForSumK(arr, idx + 1, subset, sum, s);
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        ArrayList<Integer> subset = new ArrayList<>();
        int sum = 2;
        findSubsetForSumK(arr, 0, subset, sum, 0);
    }
}
