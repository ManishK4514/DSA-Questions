// Write a program to Swap two number 

public class Swap_Two_number {
    public static void swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + " b: " + b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        swap(a, b);
    }
}
