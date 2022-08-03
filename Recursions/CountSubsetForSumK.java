// Write a program to Count all subsequences for Sum = K.

package recursion;

class CountSubsetForSumK{
    
    public static int countSubset(int arr[], int idx, int sum, int s){
        if(idx == arr.length){
            if(s == sum){
                return 1;
            }
            else{
            return 0;
            }
        }
        
        // will take
        s += arr[idx];
        int l = countSubset(arr, idx + 1, sum, s);
        s -= arr[idx];
        
        // will not take
        int r = countSubset(arr, idx + 1, sum, s);
        
        return l + r;
    }
    public static void main(String args[]){
        int arr[] = {1, 1, 2};
        int sum = 2;
        System.out.println(countSubset(arr, 0, sum, 0));
    }
}