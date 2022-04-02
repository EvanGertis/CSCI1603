package Recursion;
/*
    name: Evan Getis
    date: 03/31
    program: sum of digits
*/
import java.util.Scanner;

public class Test14 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n    = input.nextInt();
        System.out.printf("The sum of digits in %d is %d",n,sumDigits(n));
    }
    //input: int n
    //output: sum of digits
    public static int sumDigits(int n){
        //base case
        if(n == 0)
            return 0;
            return (n % 10 + sumDigits(n/10));
    }
}
