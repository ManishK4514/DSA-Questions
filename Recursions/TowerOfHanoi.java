// Write a program to move all disk from source to destination by following tower of hanoi rule.

package recursion;

public class TowerOfHanoi {
    public static void calcTowerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transferred disk " + n + " from " + src + " to " + dest);
            return;
        }
        calcTowerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transferred disk " + n + " from " + src + " to " + dest);
        calcTowerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 6;
        calcTowerOfHanoi(n, "S", "H", "D");
    }
}
