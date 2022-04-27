package Generics;
/* 
Author: Evan Gertis
Date: 04/17
Generics Demo
*/

public class genericsModuleDemo {
    public static void main(String[] args){
        Integer[] integers = {1,2,3,4,5};
        String[]  strings  = {"London", "Paris", "New York","Austin"};

        // this is a call to a generic parameterized function
        genericsModuleDemo.<Integer>print(integers);
        genericsModuleDemo.<String>print(strings);
    }

    // a generic method
    public static <E> void print(E[] list){
        for(int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
