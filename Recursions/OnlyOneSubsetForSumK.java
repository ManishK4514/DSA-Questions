// Write a program to print only one subsequences For sum = k;

package recursion;

import java.util.ArrayList;
public class OnlyOneSubsetForSumK {
    public static void printSubset(ArrayList<Integer> subset){
        if(subset.size() == 0){
            System.out.print("{}");
        }
        for(int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static boolean findSubsetForSumK(int arr[],int idx, ArrayList<Integer> subset ,int sum, int s){
        if(idx == arr.length){
            if(s == sum){
                printSubset(subset);
                return true;
            }
            else{
                return false;
            }
        }
        // will take
        subset.add(arr[idx]);
        s += arr[idx];
        if(findSubsetForSumK(arr, idx + 1, subset, sum, s) == true){
            return true;
        }
        subset.remove(subset.size() - 1);
        s -= arr[idx];

        // will not take
        if(findSubsetForSumK(arr, idx + 1, subset, sum, s) == true){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        ArrayList<Integer> subset = new ArrayList<>();
        int sum = 2;
        findSubsetForSumK(arr, 0, subset, sum, 0);
    }
}
