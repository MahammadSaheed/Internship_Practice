import java.util.*;

class Tochararray {
  static void toChar(String str) {
    char ch[] = str.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      System.out.println(ch[i]);
    }
  }

  public static void main(String args[]) {
    toChar("shaiduu");
  }
}