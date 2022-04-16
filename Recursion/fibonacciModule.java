package Recursion;
/*
Author: Evan Gertis
Date: 04/16
*/

import java.util.Scanner;

public class fibonacciModule {
    private static int count = 0;
    public static void main(String[] args){
        //create Scanner
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();

        //Find and display the fibonacci number
        System.out.println("The fibonacci number at index " + index + " is " + fib(index));
        System.out.println("total calls: "+count);
    }

    public static long fib(long index){
        count++;
        if(index == 0)// Base case
            return 0;
        else if(index == 1) // Base case
            return 1;
        else
            return fib(index - 1) + fib(index -2);
    }
}
