package Recursion;

public class Test5 {
    // f(n) = 1 if n = 1
    // f(n) = f(n-1) + n for (n > 1)

    public static void main(String[] args){
        System.out.println(sumOfN(3));
    }

    public static int sumOfN(int n){
        if(n==0)
            return 0;

        return n + sumOfN(n-1);
    }
    
}
