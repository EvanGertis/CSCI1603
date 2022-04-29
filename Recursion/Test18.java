public class Test18 {
    public static void main(String args[]){
        String palindrome = "anna";
        Boolean b = isPalindrome(palindrome);
        System.out.print("Checking to see if "+palindrome+" is a palindrome returns:  "+b.toString());
    }

    public static Boolean isPalindrome(String s){
        if(s.charAt(0) == s.charAt(s.length()-1))
            return true;
        else if(s.charAt(0) != s.charAt(s.length()-1))
            return false;
        else
            return isPalindrome(s.substring(1,s.length()-1));
    }
}
