/* 
author: Evan Gertis
date: 03/28/2022
*/
package Recursion;

public class Test9 {

    public static void main(String args[]){
        System.out.println(makeLine(5,':'));
    }

    // input: int parameter, character c
    // output: char sequence that is the length of parameter
    public static String makeLine(int parameter, Character c){
        if(parameter == 0)
            return "";
        return c + makeLine(parameter-1, c);
    }
    
}

// :::::
// :
// makeLine(parameter-1, c)
// : + :
// makeLine(parameter-1, c) + makeLine(parameter-2, c) 
// : + : + :
// : + : + : + :
// : + : + : + : + :

