// Write a program to reverse an array
// int[] arr = {23, 21, 13, 34, 2, 56, 12, 23, 37, 87}; --> before
// int[] arr = {87, 37, 23, 12, 56, 2, 34, 13, 21, 23}; --> after

package Arrays;

public class ReverseAnArray{
    public static void reverseArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
          int temp = arr[i];
          arr[i] = arr[(n - 1) - i];
          arr[(n - 1) - i] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
	public static void main (String[] args) {
		int[] arr = {23, 21, 13, 34, 2, 56, 12, 23, 37, 87};
		reverseArray(arr);  
	}
}