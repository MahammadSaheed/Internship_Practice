import java.util.*;

class Colour {
  public static void main(String args[]) {
    List<String> colour = new ArrayList<String>();
    colour.add("Red");
    colour.add("Green");
    colour.add("Yellow");
    colour.add("Black");
    colour.add("Purple");
    int count = 0, index = 0;
    
    for (String str : colour) {
      if (str.equals("Black")) {
        count++;
        index = colour.indexOf("Black");
        break;
      }
    }
    if (count == 1) {
      System.out.println("found at position " + index);
    } else {
      System.out.println("not found");
    }
  }
}