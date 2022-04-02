package Generics;
import java.util.ArrayList;
import java.util.Scanner;

/*
    name: Evan Getis
    date: 04/01
    program: sort integer
*/
public class Test2 {
    
    public static void main(String args[]){
        ArrayList<Integer> array = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < 10; i++){
            int integer    = input.nextInt();
            array.add(integer);
        }
        sort(array);
        System.out.print("The sorted numbers are ");
        for(int i = 0; i <= array.size()-1; i++){
            System.out.print(array.get(i)+" ");
        }
    }

    public static <E extends Comparable <E>> void sort(ArrayList<E> list){
        int n = list.size();
    
        for(int  i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++)
                if(list.get(j).compareTo(list.get(j+1)) > 0){
                    E temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j + 1, temp);

                }
        }
    }
}
