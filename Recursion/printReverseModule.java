package Recursion;
/*
Author: Evan Gertis
Date: 04/16 
recursive print module
output: 5 4 3 2 1 
*/

public class printReverseModule {
    public static void main(String[] args){
        xMethod(5);
    }

    public static void xMethod(int n){
        if(n > 0){
            System.out.print(n+" ");
            xMethod(n-1);
        }
    }
}
