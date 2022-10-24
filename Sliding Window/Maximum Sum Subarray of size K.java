public class Maximum_Sum_Subarray_of_size_K {
    public static int maximumSum(int[] arr, int k){
        /*
        // BruteForce Approach: Using Two pointer(Time Complexity: O(N^2) & Space Complexity: O(N)).
        int max = Integer.MIN_VALUE;
        int sum = 0;;
        for(int i = 0; i < (arr.length - (k - 1)); i++){
            sum = 0;
            for(int j = i; j < i + k; j++){
                sum += arr[j];
            }
            max = Math.max(max, sum);
            System.out.println(sum);
        }
        return max;
        */

        // Optimized Approach: Using Sliding Windows
        int i = 0, j = 0, sum = 0, max = Integer.MIN_VALUE;
        while(j <= arr.length){
            while(j < k){
                sum += arr[j];
                j++;
            }
            if(j > k){
                sum += arr[j - 1];
                sum -= arr[i - 1];
            }
            max = Math.max(max, sum);
            i++; j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;
        System.out.println(maximumSum(arr, k));
    }
}
