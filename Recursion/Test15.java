package Recursion;
/*
    name: Evan Getis
    date: 03/31
    program: sum of digits
*/
import java.util.Scanner;
import java.util.Arrays;

public class Test15 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] characterArray    = input.nextLine().toCharArray();
        System.out.print("Enter a character: ");
        char character = input.nextLine().toCharArray()[0];
        System.out.printf("appears %d times",count(characterArray, character));
    }

    //input: list of characters
    //output: display frequency of characters in the list
    public static int count(char[] chars, char ch){
        int high = 0;
        return count(chars, ch, high);
    }

    public static int count(char[] chars, char ch, int high){
        //base case
        if(chars.length == 0)
            return high;

        if(chars[chars.length-1] == ch)
            high++;

        return count(Arrays.copyOfRange(chars, 0, chars.length - 1), ch, high);
    }
}
