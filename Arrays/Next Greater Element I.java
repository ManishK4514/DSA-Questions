/*Q.Next Greater Element I --> LeetCode 496
   Example:
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
   Output: [-1,3,-1]
   Explanation: The next greater element for each value of nums1 is as follows:
   - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
   - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
   - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Next_Greater_Element {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        int temp = 0;
        boolean flag = false;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    temp = j + 1;
                    flag = false;
                    while(temp < nums2.length){
                        if(nums2[temp] > nums2[j]){
                            flag = true;
                            res.add(nums2[temp]);
                            break;
                        }
                        temp++;
                    }
                    if(!flag){
                        res.add(-1);
                    }
                }
            }
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] ans = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}
