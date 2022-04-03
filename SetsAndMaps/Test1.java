import java.util.*;

/*
    name: Evan Getis
    date: 04/02
    program: perform set operations on hash sets
*/
public class Test1 {
    
    public static void main(String args[]){
        Set<String> s1 = new HashSet<>();
        s1.add("George");
        s1.add("Jim");
        s1.add("John");
        s1.add("Blake");
        s1.add("Kevin");
        s1.add("Michael");
        Set<String> s2 = new HashSet<>();
        s2.add("George");
        s2.add("Katie");
        s2.add("Kevin");
        s2.add("Michelle");
        s2.add("Ryan");

        List<String> result = union(s1,s2);
        System.out.print("The union of the two sets is: ");
        System.out.print(result.toString());
        System.out.println();
        result = difference(s1, s2);
        System.out.print("The difference of the two sets is: ");
        System.out.print(result.toString());
        System.out.println();
        result = intersection(s1, s2);
        System.out.print("The interesection of the two sets is: ");
        System.out.print(result.toString());
        System.out.println();

        //expected output
        /*
        The union of the two sets is [George, Jim, John, Blake, Kevin, Michael, Katie, Michelle, Ryan]
        The difference of the two sets is [Jim, John, Blake, Michael]
        The intersection of the two sets is [Jim, John, Blake, Michael]
        The intersection of the two sets is [George, Kevin]
        */
    }

    public static List<String> union(Set<String> s1, Set<String> s2){
        Set<String> s = new HashSet<>(s1);
        s.addAll(s2);
        List<String> list = new ArrayList<String>(s);
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }
    
    public static List<String> difference(Set<String> s1, Set<String> s2){
        Set<String> s = new HashSet<>(s1);
        s.removeAll(s2);
        List<String> list = new ArrayList<String>(s);
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }
    
    public static List<String> intersection(Set<String> s1, Set<String> s2){
        Set<String> s = new HashSet<>(s1);
        s.retainAll(s2);
        List<String> list = new ArrayList<String>(s);
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }
}

