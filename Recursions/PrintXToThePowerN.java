// calculate x^n in (stack = n)

package recursion;

/* 
public class PrintXToThePowerN {
    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        return x * calcPower(x, n - 1);
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        calcPower(x, n);
        System.out.println(calcPower(x, n));
    }
}
*/

// calculate x^n in (stack = log n)
public class PrintXToThePowerN {
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        calcPower(x, n);
        System.out.println(calcPower(x, n));
    }
}
