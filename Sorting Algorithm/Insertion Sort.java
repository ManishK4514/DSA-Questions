// Write a program to Sort an array by using insertion sort.

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 9, 7};
        insertionSort(arr);

        // Printing the array
        for(int values: arr){
            System.out.print(values + " ");
        }
    }
}
