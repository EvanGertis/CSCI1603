import java.util.Comparator;
import java.util.Arrays;;

public class Test8 {
    public static void main(String[] args) {
    java.util.List<String> cities = java.util.Arrays.asList("Atlanta", "Savannah", "new York", "dallas");
    cities.sort((s1,s2) -> {
      if(s1.length() == 0){
        return -1;
      }
      else if (s2.length() == 0){
        return 1;
      }
      else {
        return s1.charAt(s1.length() -1 ) - s2.charAt(s2.length() - 1); 
      }
    });

    for (String s: cities) {
      System.out.print(s + " ");
    }
  }
}
