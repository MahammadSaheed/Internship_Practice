import java.util.*;

class Longest {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("apple");
    strings.add("banana");
    strings.add("orange");
    strings.add("pear");
    strings.add("pineapple");
    strings.add("strawberry");
    ArrayList<String> longStrings = longests(strings);
    System.out.println("The long strings in the list are: " + longStrings);
  }

  public static ArrayList<String> longests(ArrayList<String> strings) {
    ArrayList<String> longStrings = new ArrayList<String>();
    for (int i = 0; i < strings.size(); i++) {
      String str = strings.get(i);
      if (str.length() > 5) {
        longStrings.add(str);
      }
    }
    return longStrings;
  }
}