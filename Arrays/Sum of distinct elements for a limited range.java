import java.util.*;
public class Sum_Of_Distinct_Elements {
    public static int sumOfDistinct(int arr[], int n)
    {
        // Creating Hashset to Store the unique Elements.
        HashSet<Integer> set = new HashSet<>();
        // copying all the Elements into the Hashset.
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        int sum = 0;
        // Copying Hashset elements in new array.
        Integer[] result = set.toArray(new Integer[set.size()]);
        for(int i = 0; i < result.length; i++){
            // calculating sum
            sum += result[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 4, 6, 7, 3, 6, 7};
        int ans = sumOfDistinct(arr, arr.length);
        System.out.println("The Sum of the Distinct Elements: " + ans);
    }
}
