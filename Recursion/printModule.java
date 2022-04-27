package Recursion;
/* 
Author: Evan Gertis
Date: 04/16
print module
output: 1 2 3 4 5
*/

public class printModule {
    public static void main(String[] args){
        xMethod(5);
    }

    public static void xMethod(int n){
        if(n > 0){
            xMethod(n-1);
            System.out.print(n+" ");
        }
    }
}
