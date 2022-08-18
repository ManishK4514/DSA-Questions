// Write a program to check weather a given number is even or odd.

import java.util.Scanner;
public class Find_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if((num & 1) == 0){
            System.out.println(num + " is an even number");
        }
       else{
            System.out.println(num + " is an odd number");
        }
        sc.close();
    }
}
