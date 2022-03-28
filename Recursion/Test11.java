/* 
author: Evan Gertis
date: 03/28/2022
*/
package Recursion;

public class Test11 {
    public static void main(String args[]){
        int[] array = new int[]{1, 3, 2, 4, 3, 1};
        System.out.print("sum:");
        System.out.print(sum(array,array.length));
    }
    // input: int array, int n
    // output: sum of the array elements
    public static int sum(int[] array, int n){
        // base case
        if(n == 0)
            return 0;

        return array[n-1] + sum(array, n -1);
    }

}

// [1, 3, 2, 4, 3, 1]
// 1
// 1 + 3
// 1 + 3 + 2
// 1 + 3 + 2 + 4 + 3 
// 1 + 3 + 2 + 4 + 3 + 1