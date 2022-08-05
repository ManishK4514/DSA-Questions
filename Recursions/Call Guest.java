// Find the number of ways in which you can invite n people to your party, single or in pairs.

package recursion;

public class CallGuest {
    public static int noOfWaysToCallGuest(int n){
        if(n <= 1){
            return 1;
        }
        // Single
        int ways1 = noOfWaysToCallGuest(n - 1);
        // Pair
        int ways2 =  (n - 1) * noOfWaysToCallGuest(n - 2);
        return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n = 4;
        noOfWaysToCallGuest(n);
        System.out.println(noOfWaysToCallGuest(n));
    }
}
