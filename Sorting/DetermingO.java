public class DetermingO {
    public static void main(String args[]){
        System.out.print("result of calculating 2^3: "+f(2,3));
    }

    public static int f(int a, int n){
        if(n == 1){
            return a;
        }
        else {
            int temp = f(a, n/2);
            if(n % 2 == 0){
                return temp * temp;
            }
            else {
                return a * temp *temp;
            }
        }
    }    
}
