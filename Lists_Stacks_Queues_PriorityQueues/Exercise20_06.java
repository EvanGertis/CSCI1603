import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Timer;

public class Exercise20_06 {
    public static void main(String args[]){
        integerTimer();
    }
    
    public static void integerTimer(){
        // Step 1: generate 5 million integers
        LinkedList<Integer> list = new LinkedList();
        for(int i=0; i <5000000; i++){
            // Step 2: add 5 million integers to a LinkedList
            list.add(Integer.valueOf(i));
        }
        Collections.shuffle(list);
        
        
        final long startTime = System.currentTimeMillis();
        // Step 4: measure the time it takes to traverse the list using 
        // the iterator
        System.out.print("time: "+startTime);
        System.out.print("\n");
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            listIterator.next();
        }
        System.out.print("\n");
        final long endTime = System.currentTimeMillis();
        System.out.print("time to traverse list using listIterator: "+(endTime-startTime));
        System.out.print("\n");
        final long getIndexStartTime = System.currentTimeMillis();
        // Step 5: measure the time that it takes to travers the list
        // using get(index)
        System.out.print("\n");
        System.out.print("time: "+getIndexStartTime);
        System.out.print("\n");
        for(int i=0; i < list.size(); i++){
            list.get(i);
        }
        final long getIndexEndTime = System.currentTimeMillis();
        System.out.print("\n");
        System.out.print("time to traverse list using getIndex: "+(getIndexEndTime-getIndexStartTime));
        System.out.print("\n");
    }
}
