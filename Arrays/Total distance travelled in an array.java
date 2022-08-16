import java.util.HashMap;

/*  Q. Total distance travelled in an array
    *problem link (https://practice.geeksforgeeks.org/problems/total-distance-travelled-in-an-array3628/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=accuracy)
    Input:
    N = 5
    Arr[] = {5, 1, 4, 3, 2}
    Output: 7
    Explanation: The numbers and their respective 
    indices are given below:
    1->1
    2->4
    3->3
    4->2
    5->0
    Total distance =|4-1|+|3-4|+|2-3|+|0-2| 
    = 3+1+1+2 = 7.
*/

public class Total_distance_travelled_in_an_array {
    static long distance(int[] arr, int p) {
        /*
        // BruteForce Approach: Time complexity --> O(N^N)
        long ans = 0;
        int u = 1, m = 0, v = 2, n = 0;
        while (v <= p) {
            for (int i = 0; i < p; i++) {
                if (u == arr[i]) {
                    m = i;
                    u++;
                    break;
                }
            }
            for (int i = 0; i < p; i++) {
                if (v == arr[i]) {
                    n = i;
                    v++;
                    break;
                }
            }
            ans += Math.abs(m - n);
        }

        return ans;
        */
        // optimized Approach: Time complexity --> O(N) & Space complexity --> O(N)

        // Storing key and index of the array elements
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], i);
        }
        long sum = 0;
        for(int i = 1; i < arr.length; i++){
            sum += (long) Math.abs(map.get(i) - map.get(i + 1));
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 3, 2 };
        long ans = distance(arr, arr.length);
        System.out.println(ans + " ");
    }
}
