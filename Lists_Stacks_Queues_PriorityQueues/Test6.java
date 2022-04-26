import java.util.Comparator;
import java.util.Arrays;;

public class Test6 {
    public static void main(String[] args) {
    String[] cities = {"Atlanta", "Savannah", "new York", "dallas"};
    java.util.Arrays.sort(cities,Comparator.comparing(String::length));

    for (String s: cities) {
      System.out.print(s + " ");
    }
  }
}
