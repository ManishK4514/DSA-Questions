public class mergeSort {
    public static void merge(int arr[], int si, int mid, int ei) {
        // creating a temp array.
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        if(i > mid){
            while(j <= ei){
                temp[k] = arr[j];
                j++; k++;
            }
        }
        else{
            while(i <= mid){
                temp[k] = arr[i];
                i++; k++;
            }
        }
        // copying all the elements of temp in original array.
        for (int m = 0, n = si; m < temp.length; m++, n++) {
            arr[n] = temp[m];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        // Dividing into sub-arrays.
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 41, 1, 32, 95, 7 };
        divide(arr, 0, arr.length - 1);

        // Printing the array
        for (int values : arr) {
            System.out.print(values + " ");
        }
    }
}
