package Recursion;
/*
    name: Evan Getis
    date: 03/31
    program: GCD
*/
import java.util.Scanner;

public class Test13 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int  m    = input.nextInt();
        System.out.print("Enter the second number: ");
        int n    = input.nextInt();
        System.out.printf("The GCD of %d and %d is ",m,n);
        System.out.println(gcd(m,n));
    }
    //input: int m,n
    //output: int gcd
    public static int gcd(int m,int n){
        //base case
        if(m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
}
