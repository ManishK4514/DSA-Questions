/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 * Example 1:
   Input: nums1 = [1,2,2,1], nums2 = [2,2]
   Output: [2]
 */

import java.util.HashSet;
import java.util.Arrays;
public class Intersection_Of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        /*
         * Solution - 01 --> Time complexity: O(N^N) & Space complexity: O(2N)
         * HashSet<Integer> ans = new HashSet<>();
           for (int i = 0; i < nums1.length; i++) {
               for (int j = 0; j < nums2.length; j++) {
                   if (nums1[i] == nums2[j]) {
                       ans.add(nums1[i]);
                   }
               }
           }
           int res[] = new int[ans.size()];
           int i = 0;
   
           for (int ele : ans) {
               res[i++] = ele;
           }
           return res;
         */

         /*
          * Solution - 02 --> Time complexity: O(N) & Space complexity: O(3N)
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> intersect = new HashSet<>();
            for (int i = 0; i < nums1.length; i++) {
                set.add(nums1[i]);
            }
            for (int i = 0; i < nums2.length; i++) {
                if (set.contains(nums2[i])) {
                    intersect.add(nums2[i]);
                }
            }
            int[] result = new int[intersect.size()];
            int i = 0;
            for (Integer num : intersect) {
                result[i++] = num;
            }
            return result;
          */
        // Solution - 03 --> Time complexity: O(NlogN) & Space Complexity: O(2N).
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] ans = intersection(nums1, nums2);
        for (int values : ans) {
            System.out.print(values + " ");
        }
    }
}
