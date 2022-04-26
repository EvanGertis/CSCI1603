import java.lang.reflect.Array;
import java.util.Comparator;

public class Test10 {

    public static void main(String args[]){
        java.util.List<String> cities = java.util.Arrays.asList("Atlanta", "Savannah", "new York", "dallas");
        cities.sort(Comparator.comparing(String::length).thenComparing((s1,s2) -> s1.compareTo(s2)));

        for (String s: cities) {
        System.out.print(s + " ");
        }
    }
}
