// Given an array print all the sum of the subset generated from it, in the increasing order
// Input: N = 3, arr[] = {5,2,1}
// Output: 0,1,2,3,5,6,7,8
// Explanation: We have to find all the subset’s sum and print them.in this case the generated subsets are [ [], [1], [2], [2,1], [5], [5,1], [5,2]. [5,2,1],so the sums we get will be  0,1,2,3,5,6,7,8

package recursion;

import java.util.*;

public class subsetSum {
    public static void func(int idx, ArrayList<Integer> arr, int sum, int N, ArrayList<Integer> sumSubset){
        if(idx == N){
            sumSubset.add(sum);
            return;
        }
        // will add
        func(idx + 1, arr, sum + arr.get(idx), N, sumSubset);
        
        // will not add
        func(idx + 1, arr, sum, N, sumSubset);
    }
    static ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int N){
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, arr, 0, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        ArrayList<Integer> ans = subsetSum(arr, arr.size());
        System.out.println("The sum of each subset is: ");
        System.out.print(ans);
        // for (int i = 0; i < ans.size(); i++)
        //     System.out.print(ans.get(i) + " ");
    
    }
}
