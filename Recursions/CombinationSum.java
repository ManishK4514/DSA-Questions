// Write a program to print all possible combination, In which sum of each elements must be equal to target(k).
// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]

package recursion;

import java.util.*;

class CombinationSum{
    public static void combinationSumOfArray(int idx, int arr[],int target, ArrayList<Integer> ans){
        if(idx == arr.length){
            if(target == 0){
                for(int i = 0; i < ans.size(); i++){
                    System.out.print(ans.get(i) + " ");
                }
                System.out.println();
            }
            return;
        }
        // will add
        if(arr[idx] <= target){
            ans.add(arr[idx]);
            combinationSumOfArray(idx, arr, target - arr[idx], ans);
            ans.remove(ans.size() - 1);
        }

        // will not add
        combinationSumOfArray(idx + 1, arr, target, ans);
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 7};
        int target = 7;
        ArrayList<Integer> ans = new ArrayList<>();
        combinationSumOfArray(0, arr,target, ans);
    }
}