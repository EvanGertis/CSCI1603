package Recursion;
import java.math.*;
/* 
04/16
Evan Gertis
f(n) = 2 if n = 1
f(n) = 2 * 2^(n-1) for (n > 1)
*/

public class twoNModule {
    public static void main(String[] args){
        System.out.print(computeTwoN(3));
    }

    public static int computeTwoN(int n){
        if(n == 0){
            return 1;
        }

        return (int) (2*Math.pow(2, n-1));
    }

}
