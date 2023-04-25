import java.util.*;

public class HashCount{
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();
    set.add("apple");
    set.add("banana");
    set.add("carrot");
    set.add("dragonfruit");
    set.add("eggplant");

    int count = countStringsLongerThanFive(set);
    System.out.println("Number of strings longer than 5 characters: " + count);
  }

  public static int countStringsLongerThanFive(HashSet<String> set) {
    int count = 0;
    for (String s : set) {
      if (s.length() > 5) {
        count++;
      }
    }
    return count;
  }
}