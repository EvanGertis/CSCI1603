/*
04/27
Author: Evan Gertis
program: collections sort arrays
input: [1,3,7,6,2]
output: print sorted array
*/

public class Test12 {
    public static void main(String args[]){
        Integer[] arr = {1,3,7,6,2};
        printArray(arr);
        java.util.Arrays.sort(arr);
        printArray(arr);
    }
    public static void printArray(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
    }
}
