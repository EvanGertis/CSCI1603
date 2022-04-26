import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
    java.util.List<String> cities = java.util.Arrays.asList
      ("Atlanta", "Savannah", "new York", "dallas");
    cities.sort((s1,s2)-> s1.length() - s2.length());

    for (String s: cities) {
      System.out.print(s + " ");
    }
  }
}
