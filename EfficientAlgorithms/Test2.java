import java.util.*;

/*
    name: Evan Getis
    date: 04/02
    program: matching substrings
*/
public class Test2 {
    
    /*
    input: 
    Enter a string s1: Welcome to Java
    Enter a string s2 Java
    */
    /*
    matched at index 3
    */
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string s1:");
        String s1    = input.nextLine();
        System.out.print("Enter a string s2:");
        String s2    = input.nextLine();
        int index    = matched(s1, s2);
        if(index > 0)
            System.out.printf("matched at index %d",matched(s1, s2));
        else
            System.out.printf("No match");
    }

    public static int matched(String s1, String s2){
        return indexOfDifference(s1,s2);
    }

    public static int indexOfDifference(String str1, String str2) {
        int indexOfDifference = 0;
        for(int i = 0; i < str1.length() - str2.length(); i++) {
            if(str1.substring(i, i + str2.length()).equals(str2)){
                indexOfDifference = i;
            }
        }
        return indexOfDifference;
    }
}

