// Write a program to print all unique subset, this subset must not contain duplicates.
// Input: nums = [1,2,2]
// Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

package recursion;

import java.util.*;

class Subset2 {
    public static void findSubset(int idx,int[] nums, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i = idx; i < nums.length; i++){
            if(i != idx && nums[i] == nums[i - 1]) continue;
                ds.add(nums[i]);
                findSubset(i + 1, nums, ds, ans);
                ds.remove(ds.size() - 1);
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubset(0, nums,  new ArrayList<>(), ans);
        return ans;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 2};
        subsetsWithDup(nums);
        System.out.println(subsetsWithDup(nums));
    }
}