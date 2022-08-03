// Write a program to get all unique subset whose sum is k and we can take same index multiple times.
// Input: candidates = [2,5,2,1,2], target = 5
// Output: [ [1,2,2], [5]]


package recursion;

import java.util.*;

public class combinationSum2 {
    public static void combinationSumOfArray(int idx, int arr[],int target, ArrayList<Integer> ans){
        if(target == 0){
            for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
            }
            System.out.println();
            return;
        }
    for(int i = idx; i < arr.length; i++){
        if(i > idx && arr[i] == arr[i - 1]) continue;
        if(arr[i] > target) break;
        
        ans.add(arr[i]);
        combinationSumOfArray(i + 1, arr, target - arr[i], ans);
        ans.remove(ans.size() - 1);
    }
}
public static void main(String[] args) {
    int arr[] = {10, 1, 2, 7, 6, 1, 5};
    int target = 8;
    ArrayList<Integer> ans = new ArrayList<>();
    Arrays.sort(arr);
    combinationSumOfArray(0, arr,target, ans);
}
}
