import java.util.HashSet;

public class Exercise21_01 {
    public static void main(String args[]){
        // Step 1: create a hashset
        HashSet<String> hashSetOne = new HashSet<>();
        HashSet<String> hashSetTwo = new HashSet<>();

        hashSetOne.add("George");
        hashSetOne.add("Jim");
        hashSetOne.add("John");
        hashSetOne.add("Blake");
        hashSetOne.add("Kevin");
        hashSetOne.add("Michael");

        hashSetTwo.add("George");
        hashSetTwo.add("Katie");
        hashSetTwo.add("Kevin");
        hashSetTwo.add("Michelle");
        hashSetTwo.add("Ryan");

        // Step 2: find the union
        hashSetOne.addAll(hashSetTwo);
        // print the union
        System.out.println("The union of the two sets is");
        System.out.println(hashSetOne);
        hashSetOne.clear();
        hashSetTwo.clear();
        hashSetOne.add("George");
        hashSetOne.add("Jim");
        hashSetOne.add("John");
        hashSetOne.add("Blake");
        hashSetOne.add("Kevin");
        hashSetOne.add("Michael");

        hashSetTwo.add("George");
        hashSetTwo.add("Katie");
        hashSetTwo.add("Kevin");
        hashSetTwo.add("Michelle");
        hashSetTwo.add("Ryan");

        // Step 3: find the difference
        System.out.println("The difference of the two sets is");
        hashSetOne.removeAll(hashSetTwo);
        // print the difference
        System.out.println(hashSetOne);
        hashSetOne.clear();
        hashSetTwo.clear();
        hashSetOne.add("George");
        hashSetOne.add("Jim");
        hashSetOne.add("John");
        hashSetOne.add("Blake");
        hashSetOne.add("Kevin");
        hashSetOne.add("Michael");

        hashSetTwo.add("George");
        hashSetTwo.add("Katie");
        hashSetTwo.add("Kevin");
        hashSetTwo.add("Michelle");
        hashSetTwo.add("Ryan");

        // Step 4: find the intersection
        hashSetOne.retainAll(hashSetTwo);
        // print the intersection
        System.out.println("The intersection of the two sets is");
        System.out.println(hashSetOne);
        hashSetOne.clear();
        hashSetTwo.clear();

    }
}
