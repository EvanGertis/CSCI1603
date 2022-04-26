import java.util.Comparator;
import java.util.Arrays;;

public class Test5 {
    public static void main(String[] args) {
    String[] cities = {"Atlanta", "Savannah", "new York", "dallas"};
    java.util.Arrays.sort(cities,new SortCities());

    for (String s: cities) {
      System.out.print(s + " ");
    }
  }

  static class SortCities implements Comparator<String>
  {
    @Override
    public int compare(String s1, String s2) {
      if(s1.length() > s2.length() ){
        return 1;
      }
      else if (s1.length() == s2.length()){
        return 0;
      }
      else {
        return -1;
      }
    }
  } 
}
