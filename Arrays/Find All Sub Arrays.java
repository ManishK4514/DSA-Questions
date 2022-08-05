// Write a program to find All Sub Arrays of a array.

public class SubArrays {
    // function to find all Sub-Arrays in java
    public static void findSubArrays(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        findSubArrays(arr);
    }
}
