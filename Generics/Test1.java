package Generics;
import java.util.ArrayList;
import java.util.Scanner;

/*
    name: Evan Getis
    date: 04/01
    program: max integer
*/
public class Test1 {
    
    public static void main(String args[]){
        Integer[] array = new Integer[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < 10; i++){
            int integer    = input.nextInt();
            array[i] = integer;
        }
        System.out.print("The max number is:"+max(array));
    }

    public static <E extends Comparable <E>> E max(E[] list){
        E max = list[0];
    
        for(int i = 1; i < list.length; i++){
            if(list[i].compareTo(max) > 0){
                max = list[i];
            }
        }

        return max;
    }
}
