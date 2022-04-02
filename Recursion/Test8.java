/* 
author: Evan Gertis
date: 03/28/2022
*/
package Recursion;

// ********
// *
// makeStars(n - 1)
// * + *
// makeStars(n - 1) + makeStars(n - 2) 
// * + * + *
// * + * + * + *
// * + * + * + * + *
// * + * + * + * + * + *
public class Test8 {
    public static void main(String args[]) {
        System.out.println(makeStars(0));
        System.out.println(makeStars(8));
    }

    public static String makeStars(int n){
        //base case 1
        if(n == 0)
            return "";
        //base case 2
        if(n == 1)
            return "*";
        return '*' + makeStars(n-1);
    }
}
