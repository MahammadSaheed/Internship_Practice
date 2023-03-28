import java.util.*;

class ArrayListDemo {
  public static void main(String args[]) {
    List list = new ArrayList();
    list.add(7);
    list.add("shaiduu");
    list.add(34.45f);
    System.out.println(list);
    for (Object obj : list) {
      System.out.println(obj);
    }
  }
}