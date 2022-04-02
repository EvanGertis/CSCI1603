/* 
author: Evan Gertis
date: 03/28/2022
*/
package Recursion;

// Example
// [1,3,5,3,8,2], n = 6
// [0,3,5,3,8,2], n = 5
// [0,0,5,3,8,2], n = 4
// [0,0,0,3,8,2], n = 3
// [0,0,0,0,8,2], n = 2
// [0,0,0,0,0,2], n = 1
// [0,0,0,0,0,0], n = 0
public class Test10 {
    public static void main(String args[]){
        int[] test = new int[]{1,3,5,3,8,2};
        for(int i = 0; i < test.length; i++){
            System.out.print(test[i]);
        }
        System.out.print('\n');
        clear(test, test.length);
        for(int i = 0; i < test.length; i++){
            System.out.print(test[i]);
        }
        System.out.print('\n');
    }
    //input: int array, int n elements
    //output: set array values to 0 by value
    public static void clear(int[] array, int n){
        if(n == 0)
            return;
        array[n-1] = 0;
        clear(array, n -1);
    }
}