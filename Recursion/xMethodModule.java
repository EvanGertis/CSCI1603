package Recursion;

public class xMethodModule {
    public static void main(String[] args){
        xMethod(1234567);
    }

    public static void xMethod(int n) {
        if( n > 0){
            System.out.println(n%10);
            xMethod(n/10);
        }
    }
}
