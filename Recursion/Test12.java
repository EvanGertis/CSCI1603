package Recursion;
/*
    name: Evan Getis
    date: 03/31
    program: factorial
*/
import java.math.BigInteger;
import java.util.Scanner;

public class Test12 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String  s     = input.nextLine();
        Integer n  = Integer.parseInt(s);
        System.out.println(factorial(n));
    }
    //input: int
    //output: factorial result
    public static BigInteger factorial(int n){
        //base case
        if(n == 0)
            return BigInteger.valueOf(1);

            return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
}
