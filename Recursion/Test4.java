package Recursion;

public class Test4 {
    // f(n) = x if n = 1
    // f(n) = x * x^(n-1) for (n > 1)
    public static void main(String[] args){
       System.out.println(computeXtoTheN(3,2)); 
    }  

    public static int computeXtoTheN(int x, int n){
        if(n==0)
            return 1;
        return x*computeXtoTheN(x,n-1);
    }
    
}
