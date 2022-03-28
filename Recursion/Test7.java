/* 
author: Evan Gertis
date: 03/28/2022
*/

public class Test7 {
    public static void main(String args[]){
        System.out.println(reverse("hello"));
    }
    // input: string
    // output: reversed string
    public static String reverse(String string){
        // base case
        if(string.length() == 1)
            return string;
        else if( string.isEmpty())
            return string;
        else 
            return string.charAt(string.length() -1) + reverse(string.substring(0, string.length()-1));
    }
}

// goodbye
// e + goodby
// e + y + goodb
// e + y + b + good
// e + y + b + d + goo
// e + y + b + d + o + go
// e + y + b + d + o + o + g
// string.charAt(string.length() -1) + string.substring(0, string.length()-1)
// eybdooog

