package Recursion;
/* 
Author: Evan Gertis
Date: 04/16
f(n) = 1 if n = 1
f(n) = f(n-1) + n for (n > 1)
*/

public class recursiveSumModule {
    public static void main(String[] args){
        System.out.print(recursiveSum(6));
    }

    public static int recursiveSum(int n){
        // base case: n = 1 
        if(n == 1)
            return 1;

        return n + recursiveSum(n-1);
    }
}
