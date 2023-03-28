import java.util.*;

public class InsertAtFirst {
  public static void main(String[] args) {
    List<String> insertatfirst = new ArrayList<String>(5);
    insertatfirst.add("mistubushi");
    insertatfirst.add("mini cooper");
    insertatfirst.add("fortuner");
    insertatfirst.add("polo");
    insertatfirst.add(2, "bugati");
    for (String car : insertatfirst) {
      System.out.println("Name of the Car = " + car);
    }
  }
}