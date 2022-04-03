import java.util.*;

/*
    name: Evan Getis
    date: 04/02
    program: print out longest subsequence
*/
public class Test3 {
    
    //input: Enter a series of numbers ending with 0: 2 4 4 8 8 8 8 2 4 4 0
    //output: The longest same number sequence starts at index 3 with 4 values of 8
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a series of numbers ending with 0:");
        String s    = input.nextLine();
        findlongestSubsequence(s);
    }

    public static void findlongestSubsequence(String s){

    }
}

