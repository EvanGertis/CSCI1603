package Recursion;

public class Test3 {
    // f(n) = 2 if n = 1
    // f(n) = 2 * 2^(n-1) for (n > 1)
    public static void main(String[] args) {
      System.out.println(computeTwoN(3));
    }
  
    public static double computeTwoN(int n) {
      if(n == 1)
        return 2;
      return 2*computeTwoN(n-1);
    }
  }
  