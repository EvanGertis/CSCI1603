import java.util.*;

public class BinarySearchDemo {
    public static void main(String[] args){
        List<Integer> list1 = 
        Arrays.asList(2,4,7,10,11,45,50,59,60,66);
        System.out.println("(1) index: "+ Collections.binarySearch(list1, 7));
        System.out.println("(2) index: "+Collections.binarySearch(list1,9));
    }
}
