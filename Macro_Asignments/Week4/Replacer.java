import java.util.*;

class Replacer {
  static void replace(String str, String word, String replace) {
    System.out.println(str.replace(word, replace));
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = "welcome to mind crusher";
    System.out.println("enter the string");
    String word = sc.next();
    String replace = sc.next();
    replace(str, word, replace);
  }
}