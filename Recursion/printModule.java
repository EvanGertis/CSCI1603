package Recursion;
/*
Author: Evan Gertis
Date: 04/16 
recursive print module
*/

public class printModule {
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
