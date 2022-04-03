import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
    name: Evan Getis
    date: 04/02
    program: priority queue
*/
public class Test1 {
    
    public static void main(String args[]){
        PriorityQueue<String> pr1 = new PriorityQueue<>();
        pr1.add("George");
        pr1.add("Jim");
        pr1.add("John");
        pr1.add("Blake");
        pr1.add("Kevin");
        pr1.add("Michael");
        PriorityQueue<String> pr2 = new PriorityQueue<>();
        pr2.add("George");
        pr2.add("Katie");
        pr2.add("Kevin");
        pr2.add("Michelle");
        pr2.add("Ryan");

        PriorityQueue<String> result = union(pr1,pr2);
        System.out.print("The union of the two priority queues is: ");
        System.out.print(result.toString());
        System.out.println();
        result = difference(pr1, pr2);
        System.out.print("The difference of the two priority queues is: ");
        System.out.print(result.toString());
        System.out.println();
        result = intersection(pr1, pr2);
        System.out.print("The interesection of the two priority queues is: ");
        System.out.print(result.toString());
        System.out.println();
    }

    public static PriorityQueue<String> union(PriorityQueue<String> pr1, PriorityQueue<String> pr2){
        PriorityQueue<String> pq = new PriorityQueue<>(pr1);
        pq.addAll(pr2);
        return pq;
    }
    
    public static PriorityQueue<String> difference(PriorityQueue<String> pr1, PriorityQueue<String> pr2){
        PriorityQueue<String> pq = new PriorityQueue<>(pr1);
        pq.removeAll(pr2);
        return pq;
    }
    
    public static PriorityQueue<String> intersection(PriorityQueue<String> pr1, PriorityQueue<String> pr2){
        PriorityQueue<String> pq = new PriorityQueue<>(pr1);
        pq.retainAll(pr2);
        return pq;
    }
}
