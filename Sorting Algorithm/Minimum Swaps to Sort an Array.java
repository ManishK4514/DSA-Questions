import java.util.*;



public class Minimum_No_of_Swaps_to_Sort_The_Array {
    public static int minSwaps(int nums[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp[] = nums.clone();
        Arrays.sort(temp);
        for(int i = 0; i < nums.length; i++){
            map.put(temp[i], i);
        }
        System.out.println(map);
        int ans = 0;
        for(int i = 0; i < temp.length; i++){
            while(map.get(nums[i]) != i){
                int t1 = nums[i];
                int k = map.get(nums[i]);
                nums[i] = nums[map.get(nums[i])];
                nums[k] = t1;
                ans++;
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2, 8, 5, 4};
        System.out.println(minSwaps(nums));
    }
}
