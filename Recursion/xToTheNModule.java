package Recursion;
/* 
Author: Evan Gertis
Date: 04/16
f(n) = x if n = 1
f(n) = x * x^(n-1) for (n > 1)
*/

public class xToTheNModule {
    public static void main(String[] args){
        System.out.print(xToTheNModule(2,3));    
    }

    public static int xToTheNModule(int x, int n){
        // base case x^0 = 1
        if(n == 0){
            return 1;
        }
        
        // cast to integer return
        return (int)(x * Math.pow(x, n-1));
    }
}


