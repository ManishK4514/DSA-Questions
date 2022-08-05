// Write a program to find sort 0, 1, 2 in given array.

package Arrays;

public class Sort_0s_1s_2s {
    public static int[] sort012(int arr[], int n)
    {
       int l = 0, m = 0, h = n - 1;
       while(m <= h){
           if(arr[m] == 0){
               int temp = arr[l];
               arr[l] = arr[m];
               arr[m] = temp;
               l++;
               m++;
           }
           if(arr[m] == 1){
               m++;
           }
           if(arr[m] == 2){
               int temp2 = arr[m];
               arr[m] = arr[h];
               arr[h] = temp2;
               h--;
           }
       }
       return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        sort012(arr, arr.length);
        for(int values : arr){
            System.out.print(values + " ");
        }
    }
}
