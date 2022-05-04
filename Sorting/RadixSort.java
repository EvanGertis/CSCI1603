import java.util.Arrays;

/*
Author: Evan Gertis
Date: 05/04
program: RadixSort
*/
public class RadixSort {
    static int getMax(int arr[], int n){
        int max = arr[0];
        for(int i=0; i < n; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static void countSort(int arr[], int n, int base){
        int[] output = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // store count of occurences in count[]
        for(i = 0; i < n; i++){
            count[(arr[i]/base)%base %10]++;
        }

        // copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for(i=0; i < n; i++)
            arr[i] = output[i];
    }

    // radix sort
    static void radixsort(int arr[], int n)
    {
        // find the maximum number to know number of digits
        int m = getMax(arr, n);

        // perform counting sort for every digit. Note that instead 
        // of passing digit number, base is passed.
        // base is 10^i where is is current digit number
        for(int base = 1; m / base > 0; base *= 10)
            countSort(arr, n, base);
    }

    // utility function to print an array
    static void print(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args){
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int n     = arr.length;

        // function call
        print(arr, n);
        radixsort(arr, n);
        print(arr, n);
    }
}
