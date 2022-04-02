package Recursion;
/*
    name: Evan Getis
    date: 03/31
    program: decimal to binary
*/
import java.util.Scanner;

public class Test16 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int decimal    = input.nextInt();
        System.out.print("Enter a character: ");

        System.out.printf("%d decimal is binary %s",decimal,dec2Bin(decimal));
    }

    //input: integer
    //output: binary representation of integer as a string
    public static String dec2Bin(int decimal){
        return Integer.toBinaryString(decimal);
    }

}
