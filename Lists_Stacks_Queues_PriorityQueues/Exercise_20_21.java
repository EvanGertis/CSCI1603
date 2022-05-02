import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Comparator;

public class Exercise_20_21 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 6 strings: ");
        // Step 1: proccess strings from input
        String data = input.nextLine();
        String[] list = data.split(" ");
    
        System.out.println(Arrays.toString(list));
    
        selectionSort(list, Comparator.naturalOrder());
    
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
    
    
    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
        Arrays.sort(list, comparator);
    }
}
