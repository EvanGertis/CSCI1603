package Recursion;

public class Harmonic {

    public static void main(String args[]){
        System.out.println(harmonic(4));
    }

    public static int harmonic(int n){
        if(n==1)
            return 1;
        return 1/n + 1/harmonic(n-1);
    }
    // 1/4 + harmonic(3)
    // 1/4 + 1/3 + harmonic(2)
    // 1/4 + 1/3 + 1/2 + harmonic(1)
    // 1/4 + 1/3 + 1/2 + 1/1 + harmonic(0)
    // 1/4 + 1/3 + 1/2 + 1/1 + 1
}
