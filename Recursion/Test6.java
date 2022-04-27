package Recursion;

public class Test6 {
    public static void main(String[] args){
        System.out.println(oddevenfact(7));
    }

    public static long oddevenfact(int n){
        if(n<=0)
            return 1;
        return n * oddevenfact(n-2);
    }
}
