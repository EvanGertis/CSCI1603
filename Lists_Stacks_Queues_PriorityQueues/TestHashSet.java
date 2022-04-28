/* 
Author: Evan Gertis
Date: 04/28
program: tree hashset
*/
import java.util.*;

public class TestHashSet {
    public static void main(String[] args){
        // Create a hash set
        Set<String> set = new java.util.HashSet<>();

        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Fransisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        //Display the elements in the hash set
        for(String s: set){
            System.out.print(s.toUpperCase()+ " ");
        }

        // Processs the elements using a forrEach method
        System.out.println();
        set.forEach(e -> System.out.print(e.toLowerCase() + " "));
    }
}